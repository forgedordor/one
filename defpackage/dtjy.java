package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjy extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ String d;
    final /* synthetic */ CancellationSignal e;
    final /* synthetic */ kam f;
    final /* synthetic */ fdlt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjy(boolean z, Context context, ContentResolver contentResolver, String str, CancellationSignal cancellationSignal, kam kamVar, fdlt fdltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = context;
        this.c = contentResolver;
        this.d = str;
        this.e = cancellationSignal;
        this.f = kamVar;
        this.g = fdltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtjy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtjy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dtjy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
