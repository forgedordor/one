package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsk implements wsl {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments");
    public final fcyh a;
    private final dlwc c;

    public wsk(fcyh fcyhVar, dlwc dlwcVar, vuc vucVar) {
        fcyhVar.getClass();
        vucVar.getClass();
        this.a = fcyhVar;
        this.c = dlwcVar;
    }

    private final wry f(List list) {
        wrv wrvVarA;
        wrx wrxVar = (wrx) wry.a.createBuilder();
        wrxVar.getClass();
        DesugarCollections.unmodifiableList(((wry) wrxVar.instance).c).getClass();
        ArrayList<vvr> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vvs vvsVar = (vvs) it.next();
            vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
            if (vvrVar != null) {
                arrayList.add(vvrVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (vvr vvrVar2 : arrayList) {
            try {
                wru wruVar = (wru) wrv.a.createBuilder();
                wruVar.getClass();
                wrw.c(this.c.a(vvrVar2.a), wruVar);
                Uri uri = vvrVar2.b.c;
                if (uri != null) {
                    wrw.b(uri.toString(), wruVar);
                }
                wrvVarA = wrw.a(wruVar);
            } catch (dlwa e) {
                ekrw ekrwVarI = b.i();
                ekrwVarI.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments", "trySerialize", 113, "Attachments.kt")).t("Failed to serialize %s", vvrVar2);
                wrvVarA = null;
            }
            if (wrvVarA != null) {
                arrayList2.add(wrvVarA);
            }
        }
        wrz.b(arrayList2, wrxVar);
        return wrz.a(wrxVar);
    }

    @Override // defpackage.wsl
    public final Object a(vvv vvvVar, bpbj bpbjVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.a), new wsi(null, vvvVar, bpbjVar, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dlul r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "No AttachmentDeserializer found for "
            boolean r1 = r9 instanceof defpackage.wsj
            if (r1 == 0) goto L15
            r1 = r9
            wsj r1 = (defpackage.wsj) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            wsj r1 = new wsj
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            dlul r8 = r1.d
            defpackage.fctl.b(r9)     // Catch: defpackage.dlwa -> L2c
            goto L67
        L2c:
            r9 = move-exception
            goto L8d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r9)
            dlwc r9 = r7.c     // Catch: defpackage.dlwa -> L2c
            r1.d = r8     // Catch: defpackage.dlwa -> L2c
            r1.c = r5     // Catch: defpackage.dlwa -> L2c
            dlwb r3 = new dlwb     // Catch: defpackage.dlwa -> L2c
            java.lang.String r5 = r8.c     // Catch: defpackage.dlwa -> L2c
            r5.getClass()     // Catch: defpackage.dlwa -> L2c
            int r6 = r8.d     // Catch: defpackage.dlwa -> L2c
            r3.<init>()     // Catch: defpackage.dlwa -> L2c
            java.util.Map r9 = r9.a     // Catch: defpackage.dlwa -> L2c
            java.lang.Object r9 = r9.get(r3)     // Catch: defpackage.dlwa -> L2c
            boolean r3 = r9 instanceof defpackage.dlvz     // Catch: defpackage.dlwa -> L2c
            if (r3 == 0) goto L58
            dlvz r9 = (defpackage.dlvz) r9     // Catch: defpackage.dlwa -> L2c
            goto L59
        L58:
            r9 = r4
        L59:
            if (r9 == 0) goto L6a
            evqs r0 = r8.e     // Catch: defpackage.dlwa -> L2c
            r0.getClass()     // Catch: defpackage.dlwa -> L2c
            java.lang.Object r9 = r9.e(r0, r1)     // Catch: defpackage.dlwa -> L2c
            if (r9 != r2) goto L67
            return r2
        L67:
            dltd r9 = (defpackage.dltd) r9     // Catch: defpackage.dlwa -> L2c
            return r9
        L6a:
            dlwa r9 = new dlwa     // Catch: defpackage.dlwa -> L2c
            java.lang.String r1 = r8.c     // Catch: defpackage.dlwa -> L2c
            int r2 = r8.d     // Catch: defpackage.dlwa -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.dlwa -> L2c
            r3.<init>(r0)     // Catch: defpackage.dlwa -> L2c
            r3.append(r1)     // Catch: defpackage.dlwa -> L2c
            java.lang.String r0 = " with version "
            r3.append(r0)     // Catch: defpackage.dlwa -> L2c
            r3.append(r2)     // Catch: defpackage.dlwa -> L2c
            java.lang.String r0 = "."
            r3.append(r0)     // Catch: defpackage.dlwa -> L2c
            java.lang.String r0 = r3.toString()     // Catch: defpackage.dlwa -> L2c
            r9.<init>(r0)     // Catch: defpackage.dlwa -> L2c
            throw r9     // Catch: defpackage.dlwa -> L2c
        L8d:
            ekrg r0 = defpackage.wsk.b
            ekrw r0 = r0.i()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleComposeRow2"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r9 = r0.g(r9)
            r0 = 92
            java.lang.String r1 = "Attachments.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments"
            java.lang.String r3 = "tryDeserialize"
            ekrw r9 = r9.h(r2, r3, r0, r1)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Failed to deserialize %s"
            r9.t(r0, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsk.b(dlul, fcxy):java.lang.Object");
    }

    @Override // defpackage.wsl
    public final void c(bpbl bpblVar, vvw vvwVar) {
        vvwVar.getClass();
        bpblVar.b(f(vvwVar.b));
    }

    @Override // defpackage.wsl
    public final void d(bpcv bpcvVar, vvw vvwVar) {
        wry wryVarF = f(vvwVar.b);
        int iIntValue = bpcy.c().intValue();
        int iIntValue2 = bpcy.c().intValue();
        if (iIntValue2 < 59420) {
            dqru.x("attachments", iIntValue2);
        }
        if (iIntValue >= 59420) {
            bpcvVar.a.put("attachments", wryVarF.toByteArray());
        }
    }

    @Override // defpackage.wsl
    public final boolean e(wsa wsaVar) {
        return wsaVar.a(new fdap() { // from class: wsg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvwVar.b;
            }
        });
    }
}
