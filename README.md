# Project summary
This project is concurrent banking program.

# What is the goal of this project
The goal of this project is to show how concurrent actions can be used on the same object with the use of threads in java.

# Details about project
every banker takes an action (which are generated randomaly) from a queue and he tries to perform an action on a specific account, other bankers are on in the same time
and might try to perform another action on the same account on the same time.
a banker will try to perform the action only if the account will have more than 0 money in his account after the transaction.
if a banker cannot perform the action because of the balance issue he will sleep and will be awoken after another banker makes a transaction.
program ends when all bankers managed to perform all actions, most of the time the program will not finish because most likely an account will have not high balance while a banker tries to perform a withdrawl action with more money in the account and no other banker will try to deposit money on this specific account.
a deatiled report from all bankers is printed to system.out including threads getting stuck or banker which completes all his transactions

# How to use the project
To use the project use git clone to download the files in any IDE , recmmonded IDES are java IDE such as InteliJ or Eclipse and click run.

# Key technologies used in this project
* java for concurrent actions
* use of synchronized functions and wait and notifyAll commands to save run time resources
