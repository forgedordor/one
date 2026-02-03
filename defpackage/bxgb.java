package defpackage;

import android.graphics.BitmapFactory;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxgb implements bxgk {
    final /* synthetic */ bxgc a;

    public bxgb(bxgc bxgcVar) {
        this.a = bxgcVar;
        bxgcVar.p();
    }

    @Override // defpackage.bxgk
    public final int a() {
        return 0;
    }

    @Override // defpackage.bxgk
    public final int b() {
        return 2;
    }

    @Override // defpackage.bxgk
    public final bxgi c() {
        return null;
    }

    @Override // defpackage.bxgk
    public final bxgl d() {
        return null;
    }

    @Override // defpackage.bxgk
    public final /* bridge */ /* synthetic */ bxgz e(List list) {
        cqaz.h();
        bxgc bxgcVar = this.a;
        bxgcVar.o();
        try {
            byte[] bArr = bxgcVar.a;
            return new bxfz(f(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length), bxgcVar.d, bxgcVar.i, bxgcVar.b);
        } finally {
            bxgc bxgcVar2 = this.a;
            bxgcVar2.r();
            bxgcVar2.q();
        }
    }

    @Override // defpackage.bxgk
    public final String f() {
        return this.a.e;
    }
}
