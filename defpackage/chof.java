package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chof implements eyif {
    public static egmt a() {
        evuh evuhVar;
        int i;
        egmo egmoVar = new egmo();
        egmoVar.d = (byte) (egmoVar.d | 2);
        egmoVar.a(1000000);
        egmoVar.c = -1L;
        egmoVar.d = (byte) (egmoVar.d | 4);
        egmoVar.e = 2;
        chpk chpkVar = chpk.a;
        if (chpkVar == null) {
            throw new NullPointerException("Null valueDefaultInstance");
        }
        egmoVar.a = chpkVar;
        egmoVar.a(2000000);
        if (egmoVar.d == 7 && (evuhVar = egmoVar.a) != null && (i = egmoVar.e) != 0) {
            egmp egmpVar = new egmp(evuhVar, egmoVar.b, egmoVar.c, i);
            ejwl.m(egmpVar.b > 0, "The maximum cache size must be limited by memory or entry count as a positive integer");
            return egmpVar;
        }
        StringBuilder sb = new StringBuilder();
        if (egmoVar.a == null) {
            sb.append(" valueDefaultInstance");
        }
        if ((egmoVar.d & 1) == 0) {
            sb.append(" maxSizeBytes");
        }
        if ((2 & egmoVar.d) == 0) {
            sb.append(" maxEntryCount");
        }
        if ((egmoVar.d & 4) == 0) {
            sb.append(" filterAfterWriteMs");
        }
        if (egmoVar.e == 0) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
