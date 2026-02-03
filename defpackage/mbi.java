package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbi {
    public final UUID a;
    public final Uri b;
    public final ekgp c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ekgb g;
    public final byte[] h;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
    }

    public mbi(mbh mbhVar) {
        mee.c(true);
        UUID uuid = mbhVar.a;
        mee.f(uuid);
        this.a = uuid;
        this.b = null;
        this.c = mbhVar.c;
        this.d = false;
        this.f = false;
        this.e = true;
        this.g = mbhVar.d;
        byte[] bArr = mbhVar.e;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbi)) {
            return false;
        }
        mbi mbiVar = (mbi) obj;
        if (this.a.equals(mbiVar.a)) {
            Uri uri = mbiVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.c, mbiVar.c)) {
                boolean z = mbiVar.d;
                boolean z2 = mbiVar.f;
                boolean z3 = mbiVar.e;
                if (ekjz.h(this.g, mbiVar.g) && Arrays.equals(this.h, mbiVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.c.hashCode()) * 29791) + 1) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
    }
}
