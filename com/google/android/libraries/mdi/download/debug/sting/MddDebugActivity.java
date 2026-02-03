package com.google.android.libraries.mdi.download.debug.sting;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import defpackage.a;
import defpackage.abl;
import defpackage.dtyq;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;
import defpackage.ojc;
import defpackage.oku;
import defpackage.onk;
import defpackage.onl;
import defpackage.onm;
import defpackage.onn;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugActivity extends dtyq {
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                rect.setEmpty();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.dtyq, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewFindViewById;
        abl.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.mdd_debug_activity);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        int[] iArr = {R.id.navigation_filegroups, R.id.navigation_debuginfo};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 2; i++) {
            hashSet.add(Integer.valueOf(iArr[i]));
        }
        onl onlVar = new onl(hashSet);
        if (Build.VERSION.SDK_INT >= 28) {
            viewFindViewById = requireViewById(R.id.nav_host);
        } else {
            viewFindViewById = findViewById(R.id.nav_host);
            if (viewFindViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        viewFindViewById.getClass();
        ojc ojcVarB = oku.b(viewFindViewById);
        if (ojcVarB == null) {
            throw new IllegalStateException(a.h(this, "Activity ", " does not have a NavController set on 2131429241"));
        }
        ojcVarB.g(R.navigation.debug_navigation);
        ojcVarB.f(new onk(this, onlVar));
        bottomNavigationView.getClass();
        bottomNavigationView.d = new onm(ojcVarB);
        ojcVarB.f(new onn(new WeakReference(bottomNavigationView), ojcVarB));
        View viewFindViewById2 = findViewById(R.id.container_activity);
        ldn ldnVar = new ldn() { // from class: dtyu
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (marginLayoutParams == null) {
                    return lgtVar;
                }
                marginLayoutParams.topMargin = kzcVarF.c;
                marginLayoutParams.bottomMargin = kzcVarF.e;
                marginLayoutParams.leftMargin = kzcVarF.b;
                marginLayoutParams.rightMargin = kzcVarF.d;
                view.setLayoutParams(marginLayoutParams);
                return lgt.a;
            }
        };
        int[] iArr2 = ley.a;
        len.k(viewFindViewById2, ldnVar);
    }
}
