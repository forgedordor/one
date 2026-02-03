package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyww {
    public final CustomizationModel a;
    private final List b;
    private final crqv c;

    /* JADX WARN: Multi-variable type inference failed */
    public cyww(crqv crqvVar, ekgp ekgpVar) {
        this.c = crqvVar;
        CustomizationModel customizationModel = new CustomizationModel();
        this.a = customizationModel;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(ekgpVar.keySet());
        arrayList.remove(evyz.CAMERA_GALLERY);
        boolean z = ((Boolean) ccze.c.e()).booleanValue() && !ujw.b();
        boolean z2 = ((Boolean) ccze.f.e()).booleanValue() && !ujw.c();
        boolean zBooleanValue = ((Boolean) ccze.L.e()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ccze.g.e()).booleanValue();
        if (!z) {
            arrayList.remove(evyz.GIF);
        }
        if (!z2) {
            arrayList.remove(evyz.EXPRESSIVE_STICKER);
        }
        if (zBooleanValue) {
            arrayList.remove(evyz.GALLERY);
        }
        if (zBooleanValue2) {
            arrayList.remove(evyz.EMOJI);
        }
        if (!arrayList.contains(evyz.CUSTOMIZATION)) {
            if (c()) {
                a();
            }
            b();
            return;
        }
        if (!((Boolean) ccze.b.e()).booleanValue()) {
            if (c()) {
                a();
            }
            b();
            return;
        }
        byte[] bArrR = crqvVar.r("c2o_category_order");
        if (bArrR == null) {
            b();
            return;
        }
        try {
            customizationModel.a.clear();
            customizationModel.a.addAll(((evzd) ((evyy) ((evyy) evzd.a.createBuilder()).mergeFrom(bArrR)).build()).b);
        } catch (evtj unused) {
            cqca.f("Bugle", "CategoryOrderUtil: Cannot re-create category order from preferences. Reloading default order");
            a();
            b();
        }
        if (this.a.a() == this.b.size()) {
            return;
        }
        a();
        b();
    }

    private final void a() {
        this.c.n("c2o_category_order");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            r10 = this;
            java.util.List r0 = r10.b
            int r1 = r0.size()
            evzc[] r2 = new defpackage.evzc[r1]
            evzc r3 = defpackage.evzc.VISIBLE
            java.util.Arrays.fill(r2, r3)
            int r3 = r0.size()
            boolean[] r4 = new boolean[r3]
            r5 = 0
            r6 = r5
        L15:
            int r7 = r0.size()
            if (r6 >= r7) goto L6d
            java.lang.Object r7 = r0.get(r6)
            evyz r7 = (defpackage.evyz) r7
            int r7 = r7.ordinal()
            r8 = 1
            if (r7 == r8) goto L5a
            r9 = 4
            if (r7 == r9) goto L58
            r9 = 6
            if (r7 == r9) goto L58
            r9 = 7
            if (r7 == r9) goto L4b
            r9 = 8
            if (r7 == r9) goto L36
            goto L68
        L36:
            cczi r7 = defpackage.ccze.c
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L58
            boolean r7 = defpackage.ujw.b()
            if (r7 != 0) goto L58
            goto L68
        L4b:
            cczi r7 = defpackage.ccze.b
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r8 = r7.booleanValue()
            goto L68
        L58:
            r8 = r5
            goto L68
        L5a:
            cczi r7 = defpackage.ccze.g
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L58
        L68:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L15
        L6d:
            com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel r6 = r10.a
            java.util.ArrayList r7 = r6.a
            r7.clear()
            int r8 = r0.size()
            defpackage.cqaz.a(r8, r1)
            int r1 = r0.size()
            defpackage.cqaz.a(r1, r3)
            evzb r1 = defpackage.evzb.a
            evsf r1 = r1.createBuilder()
            evza r1 = (defpackage.evza) r1
        L8a:
            int r3 = r0.size()
            if (r5 >= r3) goto Lc9
            java.lang.Object r3 = r0.get(r5)
            evyz r3 = (defpackage.evyz) r3
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r1.instance
            evzb r8 = (defpackage.evzb) r8
            int r3 = r3.a()
            r8.b = r3
            r3 = r2[r5]
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r1.instance
            evzb r8 = (defpackage.evzb) r8
            int r3 = r3.a()
            r8.c = r3
            boolean r3 = r4[r5]
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r1.instance
            evzb r8 = (defpackage.evzb) r8
            r8.d = r3
            evsn r3 = r1.build()
            evzb r3 = (defpackage.evzb) r3
            r7.add(r3)
            int r5 = r5 + 1
            goto L8a
        Lc9:
            r6.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyww.b():void");
    }

    private final boolean c() {
        return this.c.p("c2o_category_order");
    }
}
