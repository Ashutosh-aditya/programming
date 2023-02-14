alert("Webpage is loaded")
// const product =
// {
//     ItemName : "one",
//     price : 999,
//     discount : 20,
//     ItemCode : "1A2",
//     prnt()
//     {
//         console.log(product);
//     }
// }
// product.prnt();

// function c_obj(en,pe,dt,it)
// {
//     return {
//         ItemName: en,
//         price: pe,
//         discount: dt,
//         ItemCode: it,
        
//     }
// }
// const c = c_obj('flower',100,20,'Af2');
// console.log(c)

function creat_obj(en,pe,dt,it)
{
    this.ItemCode=it,
    this.ItemName=en,
    this.price=pe,
    this.discount=dt,
    this.dv= function ()
    {
        console.log("Discount = "+this.price*this.discount/100)
    }
}
const cd = new creat_obj('flower',100,20,'Af2');
cd.dv()
console.log(cd) 
