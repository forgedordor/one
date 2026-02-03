package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnuh extends fcyz implements fdat {
    final /* synthetic */ dnuk a;
    final /* synthetic */ lok b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnuh(dnuk dnukVar, lok lokVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnukVar;
        this.b = lokVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnuh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dnuk dnukVar = this.a;
        CharSequence charSequenceA = dnukVar.a(this.c);
        CharSequence charSequenceD = this.b.d(charSequenceA, 0, charSequenceA.length(), charSequenceA.length(), 1);
        charSequenceD.getClass();
        dnukVar.f = charSequenceD;
        CharSequence charSequence = dnukVar.f;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        dnukVar.g = spanned != null ? (lop[]) spanned.getSpans(0, spanned.length(), lop.class) : null;
        dnukVar.postInvalidate();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnuh(this.a, this.b, this.c, fcxyVar);
    }
}
