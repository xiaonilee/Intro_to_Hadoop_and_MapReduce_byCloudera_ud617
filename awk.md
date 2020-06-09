
  
  971  sudo chmod 777 /home/xiaoni/Desktop/outnew/ -R
  
 
 1031  awk 'BEGIN{print "Line \t Production"} {print $1}' /home/xiaoni/Desktop/avg 
 1032  awk 'BEGIN{print "Line \t Production"} {print $1, ($2+$3+$4)}' /home/xiaoni/Desktop/avg 
 1033  awk 'BEGIN{print "Line \t Production"} {print $1, ($2+$3+$4)/NF}' /home/xiaoni/Desktop/avg 
 1034  awk 'BEGIN{print "Line \t Production"} {print $1, ($2+$3+$4)/(NF-1), NF}' /home/xiaoni/Desktop/avg 
 
