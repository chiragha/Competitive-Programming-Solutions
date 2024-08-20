int main() { /* Enter your code here. Read input from STDIN. Print output to STDOUT */
int n; cin>>n; int num[n];

for(int i=0; i<n; i++){

    cin>>num[i];
}

for(int i=1; i<n+1; i++){

    cout<<num[n-i]<<" ";

} 
return 0; }