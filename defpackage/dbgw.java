package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbgw implements dbgt {
    private final dcag a;
    private final dbgs b;

    public dbgw(Context context, String str, dbgs dbgsVar) {
        int i = dcag.n;
        dcad dcadVar = new dcad(context, str);
        dcadVar.a(dcaa.b);
        dcag dcagVar = new dcag(dcadVar.a, dcadVar.b, dcadVar.f, dcadVar.d, dcadVar.e, dcadVar.c, dcadVar.g);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.a = dcagVar;
            this.b = dbgsVar;
        }
    }

    @Override // defpackage.dbgt
    public final void a(dbgq dbgqVar) {
        dcaf dcafVar = new dcaf(this.a, evqs.x((byte[]) this.b.a(((dbgn) dbgqVar).a)));
        dcafVar.l = eyek.b(0);
        if (dcafVar.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        dcafVar.c = true;
        ((dcag) dcafVar.a).h.b(dcafVar).s(new defb() { // from class: dbgv
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                defnVar.h();
            }
        });
    }
}
