import random
def generate(expenses,size):
	'''
        Data is prepared by inserting random values 
        between 150 and 300. Data items may be assumed to 
        be repeated. 
    '''
	maximum = 300; # maximum expense of 300
	for i in range(0,size):
		expenses.insert(i,random.randint(150,maximum))
	
def compute(expenses):
	output = []
	# Add your logic below to compute based on the algorithm
	# and store the final output in output.
	return output

expenses = []
size = int(input("Enter the no of expenses:")) # number of expenses provided by the user
generate(expenses,size)
print(f"expenses:\t{expenses}")
output = compute(expenses)
print(f"output:\t\t{output}")

expenses = []
output = []