package com.example.andrei.myfirstapplication;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;

/**
 * Created by andrei on 26.08.2015.
 */
public class MView extends ImageView {
    public MView(Context context) {
        super(context);
    }

    public MView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void saveHierarchyState(SparseArray<Parcelable> container) {
        Log.d("###","saveHierarchyState");
        super.saveHierarchyState(container);

    }

    @Override
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        Log.d("###", "dispatchSaveInstanceState");
        for (int i = 0; i < container.size(); i++)
        {
            int key = container.keyAt(i);
            Log.d("###", "dispatchSaveInstanceState key="+key+"; parc="+container.get(key).toString());
        }
        super.dispatchSaveInstanceState(container);

    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Log.d("###", "onSaveInstanceState");

        return super.onSaveInstanceState();
    }

    @Override
    public void restoreHierarchyState(SparseArray<Parcelable> container) {
        Log.d("###", "restoreHierarchyState");
        super.restoreHierarchyState(container);

    }

    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        Log.d("###", "dispatchRestoreInstanceState");
        super.dispatchRestoreInstanceState(container);

    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        Log.d("###", "onRestoreInstanceState");
        super.onRestoreInstanceState(state);

    }
}
