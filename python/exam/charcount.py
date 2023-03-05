def count_characters(string):
    # Create an empty dictionary to store the character counts
    char_counts = {}

    # Iterate through each character in the string
    for char in string:
        # If the character is already in the dictionary, increment its count
        if char in char_counts:
            char_counts[char] += 1
        # Otherwise, add the character to the dictionary with a count of 1
        else:
            char_counts[char] = 1

    # Return the dictionary of character counts
    return char_counts

# Example usage:
string = input("Enter a string : ")
char_counts = count_characters(string)
# print(char_counts)
for key, value in char_counts.items():
    print(key, ":", value)

