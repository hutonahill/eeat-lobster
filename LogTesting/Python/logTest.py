import logging
import os

def main():
    # change working directory to current directory.
    path = os.path.dirname(os.path.abspath(__file__))
    os.chdir(path)

    # Create a logger
    logger = logging.getLogger('pythonTestLogger')
    logger.setLevel(logging.INFO)

    # Creating handler
    fileHandler = logging.FileHandler(os.path.join(os.pardir, 'pyJavaLatest.log'))
    fileHandler.setLevel(logging.INFO)

    # Creating Formatter
    formatter = logging.Formatter("%(asctime)s - %(filename)s - " + 
    "%(funcName)s() - %(levelname)s: %(message)s", 
    datefmt="%d/%m/%Y %I:%M:%S %p")

    # Add handler.
    fileHandler.setFormatter(formatter)

    # Add handler object to logger
    logger.addHandler(fileHandler)

    logger.info("pythong log")

main()