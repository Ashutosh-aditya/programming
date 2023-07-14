#include<stdio.h>
#include<stdlib.h>
#include<GL/glut.h>
GLfloat t [3][3]={{10.0,30.0,20.0},{20.0,20.0,40.0},{1.0,1.0,1.0}},result[3][3];
GLfloat rotatemat[3][3]={{0},{0},{0}};
GLfloat xr=10.0,yr=20.0,theta;
GLint ch;

void multiply()
{
	int i,j,k;
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			result[i][j]=0;
			for(k=0;k<3;k++)
				result[i][j]=result[i][j]+rotatemat[i][k]*t[k][j];
		}
}

void rotate_about_origin()
{
	rotatemat[0][0]=cos(theta);
	rotatemat[0][1]=-sin(theta);
	rotatemat[0][2]=0;
	rotatemat[1][0]=sin(theta);
	rotatemat[1][1]=cos(theta);
	rotatemat[1][2]=0;
	rotatemat[2][0]=0;
	rotatemat[2][1]=0;
	rotatemat[2][2]=0;
	multiply();
}

void rotate_about_fixed_point()
{
	int m = xr * (1 - cos(theta)) + yr * sin(theta);
	int n = xr * sin(theta) + yr * (1 - cos(theta));
	rotatemat[0][0]=cos(theta);
	rotatemat[0][1]=-sin(theta);
	rotatemat[0][2]=m;
	rotatemat[1][0]=sin(theta);
	rotatemat[1][1]=cos(theta);
	rotatemat[1][2]=n;
	rotatemat[2][0]=0;
	rotatemat[2][1]=0;
	rotatemat[2][2]=0; //check
	multiply();
}

void draw_triangle()
{
	glLineWidth(10);
	glBegin(GL_LINE_LOOP);
	glColor3f(1.0,0.0,0.0);
	glVertex2f(t[0][0],t[1][0]);
	glColor3f(0.0,1.0,0.0);
	glVertex2f(t[0][1],t[1][1]);
	glColor3f(0.0,0.0,1.0);
	glVertex2f(t[0][2],t[1][2]);
	glEnd();
	glFlush();
}

void draw_rotated_triangle()
{
	glLineWidth(10);
	glBegin(GL_LINE_LOOP);
	glColor3f(1.0,0.0,0.0);
	glVertex2f(result[0][0],result[1][0]);
	glColor3f(0.0,1.0,0.0);
	glVertex2f(result[0][1],result[1][1]);
	glColor3f(0.0,0.0,1.0);
	glVertex2f(result[0][2],result[1][2]);
	glEnd();
	glFlush();
}

void display()
{
	glClear(GL_COLOR_BUFFER_BIT);
	if(ch==1)
	{
		draw_triangle();
		rotate_about_origin();
		draw_rotated_triangle();
		glFlush();
	}
	if(ch==2)
	{
		draw_triangle();
		rotate_about_fixed_point();
		draw_rotated_triangle();
		glFlush();
	}
}

void myinit()
{
	glClearColor(1.0,1.0,1.0,1.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(-50.0,50.0,-50.0,50.0);
}

int main(int argc,char **argv)
{
	printf("***Rotation***\n1.Rotate about origin\n2.Roate about point(xr,yr)\n");
	printf("Enter your choice : ");
	scanf("%d",&ch);
	printf("Enter the rotation angle : ");
	scanf("%f",&theta);
	theta=(3.14/180)*theta;
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize(500,500);
	glutInitWindowPosition(0,0);
	glutCreateWindow("1JS20CS062");
	glutDisplayFunc(display);
	myinit();
	glutMainLoop();
	return 0;
}
