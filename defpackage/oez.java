package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oez implements mdc {
    public final mdd a;
    public final boolean b = true;
    public final long c = 0;
    final /* synthetic */ ofa d;
    private final meo e;

    public oez(ofa ofaVar, Context context, mdb mdbVar, mag magVar, maj majVar, mcv mcvVar, List list, meo meoVar) {
        this.d = ofaVar;
        this.e = meoVar;
        this.a = mdbVar.a(context, magVar, majVar, this, eoqg.a, mcvVar, list, true);
    }

    @Override // defpackage.mdc
    public final void a(long j) throws InterruptedException, ocp {
        ofa ofaVar = this.d;
        ofaVar.f = j;
        try {
            oex oexVar = ofaVar.e;
            if (oexVar.k != null) {
                oaw oawVar = oexVar.k;
                if (!((obe) oawVar).f.get()) {
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                int i = mjr.a;
                try {
                    ((obe) oawVar).b.signalEndOfInputStream();
                } catch (RuntimeException e) {
                    mff.h(e);
                    throw ((obe) oawVar).k(e);
                }
            }
        } catch (ocp e2) {
            this.e.a(e2);
        }
    }

    @Override // defpackage.mdc
    public final void b(mcw mcwVar) {
        this.e.a(new ocp("Video frame processing error", mcwVar, 5001));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0467 A[Catch: ocp -> 0x0474, TryCatch #0 {ocp -> 0x0474, blocks: (B:3:0x0004, B:6:0x000e, B:11:0x001b, B:12:0x0024, B:14:0x0030, B:15:0x0032, B:17:0x0041, B:19:0x0051, B:20:0x0054, B:21:0x0065, B:23:0x0081, B:25:0x0085, B:30:0x0096, B:38:0x00d7, B:39:0x00e5, B:41:0x00ea, B:45:0x00f2, B:49:0x00fe, B:53:0x0108, B:56:0x0128, B:94:0x020f, B:97:0x0248, B:99:0x024c, B:103:0x0272, B:105:0x0278, B:108:0x0286, B:110:0x0292, B:111:0x029d, B:113:0x02a4, B:115:0x02ad, B:136:0x0304, B:139:0x030c, B:141:0x0314, B:143:0x032f, B:147:0x0340, B:151:0x0357, B:172:0x03c5, B:174:0x03cb, B:176:0x03d9, B:177:0x03dc, B:179:0x041b, B:180:0x041d, B:182:0x0427, B:184:0x042c, B:186:0x0432, B:190:0x043d, B:192:0x045f, B:193:0x0464, B:187:0x0435, B:189:0x043b, B:152:0x035b, B:154:0x035f, B:156:0x0365, B:158:0x0371, B:160:0x037d, B:162:0x0389, B:164:0x0395, B:166:0x03a1, B:168:0x03ad, B:170:0x03b9, B:171:0x03bf, B:144:0x0333, B:145:0x0339, B:146:0x033a, B:116:0x02b1, B:118:0x02b7, B:120:0x02c1, B:122:0x02cb, B:126:0x02d8, B:128:0x02e4, B:129:0x02e8, B:131:0x02ef, B:133:0x02f8, B:134:0x02fb, B:100:0x0253, B:102:0x025b, B:194:0x0467, B:195:0x046d, B:59:0x0131, B:61:0x0139, B:64:0x0140, B:66:0x014e, B:69:0x0155, B:72:0x0165, B:78:0x0193, B:81:0x01a3, B:84:0x01b6, B:86:0x01f1, B:88:0x01f5, B:92:0x01ff, B:91:0x01fc, B:75:0x0179, B:77:0x017d, B:65:0x014a, B:196:0x046e, B:197:0x0473, B:33:0x00c8, B:35:0x00cc, B:26:0x0088, B:28:0x0090, B:29:0x0093), top: B:203:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f A[Catch: ocp -> 0x0474, TRY_LEAVE, TryCatch #0 {ocp -> 0x0474, blocks: (B:3:0x0004, B:6:0x000e, B:11:0x001b, B:12:0x0024, B:14:0x0030, B:15:0x0032, B:17:0x0041, B:19:0x0051, B:20:0x0054, B:21:0x0065, B:23:0x0081, B:25:0x0085, B:30:0x0096, B:38:0x00d7, B:39:0x00e5, B:41:0x00ea, B:45:0x00f2, B:49:0x00fe, B:53:0x0108, B:56:0x0128, B:94:0x020f, B:97:0x0248, B:99:0x024c, B:103:0x0272, B:105:0x0278, B:108:0x0286, B:110:0x0292, B:111:0x029d, B:113:0x02a4, B:115:0x02ad, B:136:0x0304, B:139:0x030c, B:141:0x0314, B:143:0x032f, B:147:0x0340, B:151:0x0357, B:172:0x03c5, B:174:0x03cb, B:176:0x03d9, B:177:0x03dc, B:179:0x041b, B:180:0x041d, B:182:0x0427, B:184:0x042c, B:186:0x0432, B:190:0x043d, B:192:0x045f, B:193:0x0464, B:187:0x0435, B:189:0x043b, B:152:0x035b, B:154:0x035f, B:156:0x0365, B:158:0x0371, B:160:0x037d, B:162:0x0389, B:164:0x0395, B:166:0x03a1, B:168:0x03ad, B:170:0x03b9, B:171:0x03bf, B:144:0x0333, B:145:0x0339, B:146:0x033a, B:116:0x02b1, B:118:0x02b7, B:120:0x02c1, B:122:0x02cb, B:126:0x02d8, B:128:0x02e4, B:129:0x02e8, B:131:0x02ef, B:133:0x02f8, B:134:0x02fb, B:100:0x0253, B:102:0x025b, B:194:0x0467, B:195:0x046d, B:59:0x0131, B:61:0x0139, B:64:0x0140, B:66:0x014e, B:69:0x0155, B:72:0x0165, B:78:0x0193, B:81:0x01a3, B:84:0x01b6, B:86:0x01f1, B:88:0x01f5, B:92:0x01ff, B:91:0x01fc, B:75:0x0179, B:77:0x017d, B:65:0x014a, B:196:0x046e, B:197:0x0473, B:33:0x00c8, B:35:0x00cc, B:26:0x0088, B:28:0x0090, B:29:0x0093), top: B:203:0x0004 }] */
    @Override // defpackage.mdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r28, int r29) throws defpackage.ocp {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oez.e(int, int):void");
    }

    @Override // defpackage.mdc
    public final /* synthetic */ void d(float f) {
    }

    @Override // defpackage.mdc
    public final void c(long j, boolean z) {
    }
}
