class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        int n=nums.size();
        vector<int>res;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                res.push_back(i);
            }
        }
        return res;
    }
};
