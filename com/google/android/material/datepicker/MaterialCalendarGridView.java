package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import defpackage.eehr;
import defpackage.eehs;
import defpackage.eeht;
import defpackage.eeii;
import defpackage.eeio;
import defpackage.eeit;
import defpackage.eejd;
import defpackage.eemo;
import defpackage.lcb;
import defpackage.ley;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private static int b(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eeit getAdapter() {
        return (eeit) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Object obj;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int i;
        int width;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        eeit adapter = materialCalendarGridView.getAdapter();
        eeht eehtVar = adapter.c;
        eehs eehsVar = adapter.e;
        int iMax = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (lcb lcbVar : eehtVar.b()) {
            Object obj2 = lcbVar.a;
            if (obj2 == null || (obj = lcbVar.b) == null) {
                materialCalendarGridView = this;
            } else {
                Long l = (Long) obj2;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    iMax = iMax;
                    iMin = iMin;
                    adapter = adapter;
                } else {
                    boolean zK = eemo.k(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        if (iMax % adapter.b.d == 0) {
                            right = 0;
                        } else {
                            int i2 = iMax - 1;
                            right = !zK ? materialCalendarGridView.c(i2).getRight() : materialCalendarGridView.c(i2).getLeft();
                        }
                        iB = right;
                        iA = iMax;
                    } else {
                        Calendar calendar = materialCalendarGridView.a;
                        calendar.setTimeInMillis(jLongValue);
                        iA = adapter.a(calendar.get(5));
                        iB = b(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iB2 = (iMin + 1) % adapter.b.d == 0 ? materialCalendarGridView.getWidth() : !zK ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        Calendar calendar2 = materialCalendarGridView.a;
                        calendar2.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(calendar2.get(5));
                        iB2 = b(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i3 = iMax;
                    int i4 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop();
                        eehr eehrVar = eehsVar.a;
                        int iB3 = top + eehrVar.b();
                        eeit eeitVar = adapter;
                        int bottom = viewC.getBottom() - eehrVar.a();
                        if (zK) {
                            int i5 = iA2 > numColumns2 ? 0 : iB2;
                            if (numColumns > iA) {
                                int i6 = i5;
                                width = getWidth();
                                i = i6;
                            } else {
                                i = i5;
                                width = iB;
                            }
                        } else {
                            i = numColumns > iA ? 0 : iB;
                            width = iA2 > numColumns2 ? getWidth() : iB2;
                        }
                        canvas.drawRect(i, iB3, width, bottom, eehsVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = eeitVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i3;
                    iMin = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().c());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().c())) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof eeit)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), eeit.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = eejd.e();
        if (eeio.ba(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.b = eeio.bb(getContext(), R.attr.nestedScrollable);
        ley.p(this, new eeii());
    }
}
