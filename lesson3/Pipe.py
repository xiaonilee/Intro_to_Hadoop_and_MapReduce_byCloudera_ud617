

## Test code outside of hadoop:
cat testfile | ./DefensiveMapperCode.py | sort | ./Reducer.py

## Run code inside of hadoop:
hdfs dfs DefensiveMapperCode.py Reducer.py /myinput /output