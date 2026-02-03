package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmw implements wms {
    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        dltd dltdVar = vvrVar.a;
        if (dltdVar instanceof dnvg) {
            return new wno(new wnr((dnvg) dltdVar, vvrVar.b.c), null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
