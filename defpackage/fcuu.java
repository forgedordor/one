package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcuu extends fcuh implements RandomAccess {
    final /* synthetic */ long[] a;

    public fcuu(long[] jArr) {
        this.a = jArr;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.fcub, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Long) {
            return fcur.D(this.a, ((Number) obj).longValue()) >= 0;
        }
        return false;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(this.a[i]);
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        return fcur.D(this.a, ((Number) obj).longValue());
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Number) obj).longValue();
        long[] jArr = this.a;
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (jLongValue == jArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
