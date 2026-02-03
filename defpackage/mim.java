package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mim implements mhl {
    public long a;
    private final mhl b;

    public mim(mhl mhlVar) {
        this.b = mhlVar;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) {
        int iA = this.b.a(bArr, i, i2);
        if (iA != -1) {
            this.a += iA;
        }
        return iA;
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) {
        Uri uri = mhtVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return this.b.b(mhtVar);
        } finally {
            c();
            e();
        }
    }

    @Override // defpackage.mhl
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.mhl
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.mhl
    public final Map e() {
        return this.b.e();
    }

    @Override // defpackage.mhl
    public final void f(min minVar) {
        mee.f(minVar);
        this.b.f(minVar);
    }
}
