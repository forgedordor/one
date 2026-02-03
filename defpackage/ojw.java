package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojw implements Comparable {
    public final ojx a;
    public final Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f;

    public ojw(ojx ojxVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = ojxVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ojw ojwVar) {
        ojwVar.getClass();
        if (this.c) {
            if (!ojwVar.c) {
                return 1;
            }
        } else if (ojwVar.c) {
            return -1;
        }
        int i = this.d - ojwVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = this.b;
        if (bundle != null && ojwVar.b == null) {
            return 1;
        }
        if (bundle == null && ojwVar.b != null) {
            return -1;
        }
        if (bundle != null) {
            Bundle bundle2 = ojwVar.b;
            int size = bundle.size();
            bundle2.getClass();
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        if (this.e) {
            if (!ojwVar.e) {
                return 1;
            }
        } else if (ojwVar.e) {
            return -1;
        }
        return this.f - ojwVar.f;
    }
}
