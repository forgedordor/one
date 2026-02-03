package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pv extends ud {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public pv() {
        super(-2);
        this.a = false;
    }

    public pv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public pv(pv pvVar) {
        super((ViewGroup.LayoutParams) pvVar);
        this.a = pvVar.a;
    }

    public pv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
