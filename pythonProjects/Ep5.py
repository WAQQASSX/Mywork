# class calculator:
#     def __init__(self):
#         pass
#     def add(a, b):
#         return a + b
#     def subtract(a, b):
#         return a - b
#     def divide(a, b):
#         if b == 0 :
#             pass
#         else:
#             return a / b
#     def multiply(a, b):
#         return a * b
#     def power(a, b):
#         return a ** b
# print(calculator.add(10,4))
# n= True
# while n: 
#     num1= int(input("Enter the first number: "))
#     op= input("Enter the operation: ")
#     num2= int(input("Enter the second number: "))
#     def calculate(num1, op, num2):
#         if op == "+":
#             print(num1 + num2)
#         elif op == "-":
#             print(num1 - num2)
#         elif op == "*":
#             print(num1 * num2)
#         elif op == "/":
#             if num2 == 0:
#                 pass
#             else:
#                 print(num1 / num2)
#         elif op == "**":
#             print(num1 ** num2)
#         else:
#                 print("Invalid operation")
#     calculate(num1, op, num2)
#     c= input("Do you want to continue? (y/n): ")
#     if c == "y":
#         continue
#         print("Continue")
#     elif c == "n":
#         break   
#     else:
#         print("Invalid input")
#         break
    
        

def safe_eval(expression):
    try:
        result = eval(expression)
        return result
    except Exception as e:
        return "invaild math"

expression = input("Enter your math expression: ")
vaildOpertors = ["+", "-", "*", "/", " "]
def c(expression):
    value = True
    for e in expression:
        try:
            float(e)
        except:
            if e not in vaildOpertors:
                value = False
                break
    return value

if c(expression):
    print("valid math")
    print(safe_eval(expression))
else:
    print("invalid math")