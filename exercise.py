class Employee:
    def __init__(self, name, experience, hourly_rate, hours_worked):
        self.name = name
        self.experience = experience
        self.hourly_rate = hourly_rate
        self.hours_worked = hours_worked

    def calculate_salary(self):
        if self.experience < 8:
            base_salary = self.hourly_rate * self.hours_worked * 30
            tax_deduction = 0.13 * base_salary
            total_salary = base_salary - tax_deduction
            return total_salary
        else:
            base_salary = self.hourly_rate * self.hours_worked * 30
            bonus = 10000
            total_salary = base_salary + bonus
            tax_deduction = 0.13 * total_salary
            total_salary -= tax_deduction
            return total_salary


def input_employee_details():
    name = input("Enter employee name: ")
    experience = int(input("Enter employee experience in years: "))
    hourly_rate = int(input("Enter employee hourly rate: "))
    hours_worked = int(input("Enter employee hours worked per day: "))
    return name, experience, hourly_rate, hours_worked


name, experience, hourly_rate, hours_worked = input_employee_details()
employee = Employee(name, experience, hourly_rate, hours_worked)

salary = employee.calculate_salary()
print(f"{employee.name} with {employee.experience} years of experience has a salary of {salary} dollars.")
