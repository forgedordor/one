package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffn extends fcuh implements RandomAccess {
    public static final fffm a = new fffm();
    public final fffd[] b;
    public final int[] c;

    public fffn(fffd[] fffdVarArr, int[] iArr) {
        this.b = fffdVarArr;
        this.c = iArr;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof fffd) {
            return super.contains((fffd) obj);
        }
        return false;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.b[i];
    }

    @Override // defpackage.fcuh, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof fffd) {
            return super.indexOf((fffd) obj);
        }
        return -1;
    }

    @Override // defpackage.fcuh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof fffd) {
            return super.lastIndexOf((fffd) obj);
        }
        return -1;
    }
}
