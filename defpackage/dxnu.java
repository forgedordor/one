package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnu implements dxnh {
    public static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final eygg c;
    private final dxmz d;

    public dxnu(Context context, eygg eyggVar, dxmz dxmzVar) {
        context.getClass();
        eyggVar.getClass();
        dxmzVar.getClass();
        this.b = context;
        this.c = eyggVar;
        this.d = dxmzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[Catch: dxna -> 0x010b, TryCatch #2 {dxna -> 0x010b, blocks: (B:2:0x0000, B:4:0x0047, B:5:0x0056, B:7:0x005d, B:8:0x0071, B:12:0x0079, B:14:0x007c, B:18:0x0083, B:20:0x0089, B:22:0x008f, B:30:0x00a9, B:33:0x00b7, B:42:0x00d9, B:39:0x00ca, B:43:0x00e8), top: B:52:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ defpackage.dxft d(defpackage.dxnu r9, boolean r10, boolean r11, boolean r12, int r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxnu.d(dxnu, boolean, boolean, boolean, int):dxft");
    }

    private final synchronized String e(boolean z) {
        eygg eyggVar = this.c;
        String string = ((SharedPreferences) eyggVar.b()).getString("fetch_only_id", null);
        if (!TextUtils.isEmpty(string) || !z) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        ((SharedPreferences) eyggVar.b()).edit().putString("fetch_only_id", string2).apply();
        return string2;
    }

    @Override // defpackage.dxnh
    public final dxft a(dxng dxngVar) {
        return d(this, dxngVar.a, dxngVar.b, dxngVar.c, 8);
    }

    @Override // defpackage.dxnh
    public final dxft b(boolean z) throws NumberFormatException {
        dxft dxftVarD = d(this, false, z, z, 1);
        if (!(dxftVarD instanceof dxfx)) {
            return (dxfo) dxftVarD;
        }
        evcw evcwVar = (evcw) evcx.a.createBuilder();
        evcwVar.getClass();
        evff evffVar = (evff) ((dxfx) dxftVarD).a;
        evfs evfsVar = evffVar.b == 1 ? (evfs) evffVar.c : evfs.a;
        evdh evdhVar = (evdh) evdi.a.createBuilder();
        if ((evfsVar.b & 1) != 0) {
            String str = evfsVar.c;
            evdhVar.copyOnWrite();
            evdi evdiVar = (evdi) evdhVar.instance;
            str.getClass();
            evdiVar.b = 1 | evdiVar.b;
            evdiVar.c = str;
        }
        if ((evfsVar.b & 2) != 0) {
            String str2 = evfsVar.d;
            evdhVar.copyOnWrite();
            evdi evdiVar2 = (evdi) evdhVar.instance;
            str2.getClass();
            evdiVar2.b |= 2;
            evdiVar2.d = str2;
        }
        if ((evfsVar.b & 4) != 0) {
            long j = evfsVar.e;
            evdhVar.copyOnWrite();
            evdi evdiVar3 = (evdi) evdhVar.instance;
            evdiVar3.b |= 4;
            evdiVar3.e = j;
        }
        if ((evfsVar.b & 8) != 0) {
            String str3 = evfsVar.f;
            evdhVar.copyOnWrite();
            evdi evdiVar4 = (evdi) evdhVar.instance;
            str3.getClass();
            evdiVar4.b |= 8;
            evdiVar4.f = str3;
        }
        if ((evfsVar.b & 16) != 0) {
            long j2 = evfsVar.g;
            evdhVar.copyOnWrite();
            evdi evdiVar5 = (evdi) evdhVar.instance;
            evdiVar5.b |= 16;
            evdiVar5.g = j2;
        }
        evdi evdiVar6 = (evdi) evdhVar.build();
        evdiVar6.getClass();
        evcy.b(evdiVar6, evcwVar);
        return new dxfx(evcy.a(evcwVar));
    }

    @Override // defpackage.dxnh
    public final void c() {
        eygg eyggVar = this.c;
        if (TextUtils.isEmpty(((SharedPreferences) eyggVar.b()).getString("fetch_only_id", null))) {
            return;
        }
        ((SharedPreferences) eyggVar.b()).edit().putString("fetch_only_id", UUID.randomUUID().toString()).apply();
    }
}
