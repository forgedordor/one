package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgw {
    public final Map a = new HashMap();
    final /* synthetic */ dhgy b;

    public dhgw(dhgy dhgyVar) {
        this.b = dhgyVar;
    }

    public final void a() throws InterruptedException {
        int i;
        Object obj;
        final dhgx dhgxVar = new dhgx();
        final dhgy dhgyVar = this.b;
        synchronized (dhgyVar) {
            if (dhgyVar.e > 0) {
                dhgyVar.d = new HashMap(dhgyVar.d);
            }
            dhgxVar.a = dhgyVar.d;
            dhgyVar.e++;
            synchronized (this) {
                Map map = this.a;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this) {
                        dhgy dhgyVar2 = this.b;
                        if (dhgyVar2.d.containsKey(str)) {
                            dhgyVar2.d.remove(str);
                        }
                    } else {
                        dhgy dhgyVar3 = this.b;
                        if (!dhgyVar3.d.containsKey(str) || (obj = dhgyVar3.d.get(str)) == null || !obj.equals(value)) {
                            dhgyVar3.d.put(str, value);
                        }
                    }
                }
                map.clear();
            }
        }
        Runnable runnable = new Runnable() { // from class: dhgt
            /* JADX WARN: Can't wrap try/catch for region: R(11:77|4|5|(2:7|(3:9|(1:11)|55)(1:12))|80|13|82|14|81|(1:28)(7:29|67|30|31|75|32|33)|55) */
            /* JADX WARN: Can't wrap try/catch for region: R(8:77|4|5|(4:(2:7|(3:9|(1:11)|55)(1:12))|81|(1:28)(7:29|67|30|31|75|32|33)|55)|80|13|82|14) */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
            
                r3 = r0.getParentFile();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
            
                if (r3 == null) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
            
                r3 = new java.io.FileOutputStream(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
            
                r3 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
            
                defpackage.cqca.h("RcsClientLib", r3, "Couldn't create file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r0))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
            
                defpackage.cqca.f("RcsClientLib", "Couldn't create directory for file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r0))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
            
                r3 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
            
                defpackage.cqca.p("RcsClientLib", r0, "writeToFile: Got exception:");
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
            
                if (r1.b.exists() != false) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
            
                defpackage.cqca.f("RcsClientLib", "Couldn't clean up partially-written file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r1.b))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
            
                r4.a(false);
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #8 {all -> 0x00cc, blocks: (B:28:0x009a, B:29:0x009e, B:31:0x00ab, B:32:0x00ae, B:40:0x00cb, B:39:0x00c8, B:30:0x00a5, B:36:0x00c3), top: B:81:0x0098, inners: #0, #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #8 {all -> 0x00cc, blocks: (B:28:0x009a, B:29:0x009e, B:31:0x00ab, B:32:0x00ae, B:40:0x00cb, B:39:0x00c8, B:30:0x00a5, B:36:0x00c3), top: B:81:0x0098, inners: #0, #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dhgt.run():void");
            }
        };
        synchronized (dhgyVar) {
            i = dhgyVar.e;
        }
        if (i == 1) {
            runnable.run();
        } else {
            dhgy.a.execute(runnable);
        }
        try {
            dhgxVar.b.await();
            boolean z = dhgxVar.c;
        } catch (InterruptedException unused) {
        }
    }
}
