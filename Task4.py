def sum_of_three():
    try:
        a=float(input("Enter the first number:"))
        b=float(input("Enter the second number:"))
        c=float(input("Enter the third number: "))
        sum=a+b+c

        print(f"The sum of {a},{b}, and {c} is {sum}")
    except ValueError:
        print("Invalid Input")
sum_of_three()
