import os.path

responses = {}
filename = "responses.txt"

def train_bot(n):
    for i in range(n):
        user_input = input("Enter a question: ")
        response = input("Enter the response: ")
        responses[user_input] = response
    with open(filename, "w") as f:
        for key, value in responses.items():
            f.write(key + ":" + value + "\n")

def load_responses():
    if os.path.exists(filename):
        with open(filename, "r") as f:
            lines = f.readlines()
            for line in lines:
                key, value = line.strip().split(":")
                responses[key] = value
    return responses

def respond(user_input):
    if user_input in responses:
        return responses[user_input]
    else:
        new_response = input("I don't know the answer. Please provide the correct response: ")
        responses[user_input] = new_response
        with open(filename, "a") as f:
            f.write(user_input + ":" + new_response + "\n")
        return new_response


responses = load_responses()

if not responses:
    num_questions = int(input("Enter the number of questions you want to train the bot with: "))
    train_bot(num_questions)

while True:
    user_input = input("Ask a question: ")
    if user_input == 'exit':
        break
    response = respond(user_input)
    print("Bot:", response)
