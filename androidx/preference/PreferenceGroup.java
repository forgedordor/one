package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.car.app.model.Alert;
import defpackage.cvw;
import defpackage.kyz;
import defpackage.ozn;
import defpackage.ozp;
import defpackage.pac;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final cvw a;
    public final List b;
    public boolean c;
    public int d;
    private final Handler e;
    private boolean f;
    private int g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void ag(Preference preference) {
        synchronized (this) {
            super.P();
            if (preference.D == this) {
                preference.w(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.eT()));
                    Handler handler = this.e;
                    Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.c) {
                    preference.D();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.F();
        this.c = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).B();
        }
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.P();
        this.c = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).D();
        }
    }

    public final void ab() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ag((Preference) list.get(0));
                }
            }
        }
        A();
    }

    public final void ac(int i) {
        if (i != Integer.MAX_VALUE && !S()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.d = i;
    }

    public boolean ad() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae(androidx.preference.Preference r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.b
            boolean r1 = r0.contains(r6)
            if (r1 != 0) goto L9e
            java.lang.String r1 = r6.s
            if (r1 == 0) goto L28
            r1 = r5
        Ld:
            androidx.preference.PreferenceGroup r2 = r1.D
            if (r2 == 0) goto L13
            r1 = r2
            goto Ld
        L13:
            java.lang.String r2 = r6.s
            androidx.preference.Preference r1 = r1.l(r2)
            if (r1 == 0) goto L28
            java.lang.String r1 = "Found duplicated key: \""
            java.lang.String r3 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r1 = defpackage.a.a(r2, r1, r3)
            java.lang.String r2 = "PreferenceGroup"
            android.util.Log.e(r2, r1)
        L28:
            int r1 = r6.p
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L47
            boolean r1 = r5.f
            if (r1 == 0) goto L3c
            int r1 = r5.g
            int r2 = r1 + 1
            r5.g = r2
            r6.I(r1)
        L3c:
            boolean r1 = r6 instanceof androidx.preference.PreferenceGroup
            if (r1 == 0) goto L47
            r1 = r6
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r2 = r5.f
            r1.f = r2
        L47:
            int r0 = java.util.Collections.binarySearch(r0, r6)
            if (r0 >= 0) goto L50
            int r0 = -r0
            int r0 = r0 + (-1)
        L50:
            boolean r1 = r5.j()
            r6.X(r1)
            monitor-enter(r5)
            java.util.List r1 = r5.b     // Catch: java.lang.Throwable -> L9b
            r1.add(r0, r6)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            ozy r0 = r5.k
            java.lang.String r1 = r6.s
            if (r1 == 0) goto L7a
            cvw r2 = r5.a
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.remove(r1)
            goto L7e
        L7a:
            long r3 = r0.a()
        L7e:
            r6.l = r3
            r1 = 1
            r6.m = r1
            r1 = 0
            r6.C(r0)     // Catch: java.lang.Throwable -> L97
            r6.m = r1
            r6.w(r5)
            boolean r0 = r5.c
            if (r0 == 0) goto L93
            r6.B()
        L93:
            r5.A()
            return
        L97:
            r0 = move-exception
            r6.m = r1
            throw r0
        L9b:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r6
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.ae(androidx.preference.Preference):void");
    }

    public final void af(Preference preference) {
        ag(preference);
        A();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        return new ozp(super.e(), this.d);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ozp.class)) {
            super.g(parcelable);
            return;
        }
        ozp ozpVar = (ozp) parcelable;
        this.d = ozpVar.a;
        super.g(ozpVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference preferenceL;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = o(i);
            if (TextUtils.equals(preferenceO.s, charSequence)) {
                return preferenceO;
            }
            if ((preferenceO instanceof PreferenceGroup) && (preferenceL = ((PreferenceGroup) preferenceO).l(charSequence)) != null) {
                return preferenceL;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void x(Bundle bundle) {
        super.x(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).x(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(boolean z) {
        super.z(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).X(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new cvw();
        this.e = new Handler(Looper.getMainLooper());
        this.f = true;
        this.g = 0;
        this.c = false;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = new ozn(this);
        this.b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.i, i, i2);
        this.f = kyz.h(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ac(kyz.k(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
