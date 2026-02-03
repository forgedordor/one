package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihf {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).h;
        if (focusTargetNode2 == null || !focusTargetNode2.C) {
            return null;
        }
        return focusTargetNode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x001b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            icr r8 = r8.s
            boolean r0 = r8.C
            r1 = 0
            if (r0 == 0) goto La0
            hum r0 = new hum
            r2 = 16
            icr[] r3 = new defpackage.icr[r2]
            r0.<init>(r3)
            icr r3 = r8.w
            if (r3 != 0) goto L18
            defpackage.jbg.j(r0, r8)
            goto L1b
        L18:
            r0.n(r3)
        L1b:
            int r8 = r0.b
            if (r8 == 0) goto La0
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            icr r8 = (defpackage.icr) r8
            int r3 = r8.u
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L31
            defpackage.jbg.j(r0, r8)
            goto L1b
        L31:
            if (r8 == 0) goto L1b
            int r3 = r8.t
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L9d
            r3 = r1
        L3a:
            if (r8 == 0) goto L1b
            boolean r4 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            r5 = 1
            if (r4 == 0) goto L63
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            icr r4 = r8.s
            boolean r4 = r4.C
            if (r4 == 0) goto L98
            igx r4 = r8.f()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L62
            if (r4 == r5) goto L62
            r5 = 2
            if (r4 == r5) goto L62
            r8 = 3
            if (r4 != r8) goto L5c
            goto L98
        L5c:
            fctg r8 = new fctg
            r8.<init>()
            throw r8
        L62:
            return r8
        L63:
            int r4 = r8.t
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L98
            boolean r4 = r8 instanceof defpackage.jbi
            if (r4 == 0) goto L98
            r4 = r8
            jbi r4 = (defpackage.jbi) r4
            icr r4 = r4.E
            r6 = 0
        L73:
            if (r4 == 0) goto L96
            int r7 = r4.t
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L93
            int r6 = r6 + 1
            if (r6 != r5) goto L81
            r8 = r4
            goto L93
        L81:
            if (r3 != 0) goto L8a
            hum r3 = new hum
            icr[] r7 = new defpackage.icr[r2]
            r3.<init>(r7)
        L8a:
            if (r8 == 0) goto L8f
            r3.n(r8)
        L8f:
            r3.n(r4)
            r8 = r1
        L93:
            icr r4 = r4.w
            goto L73
        L96:
            if (r6 == r5) goto L3a
        L98:
            icr r8 = defpackage.jbg.a(r3)
            goto L3a
        L9d:
            icr r8 = r8.w
            goto L31
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihf.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final ihu c(FocusTargetNode focusTargetNode) {
        jer jerVar = focusTargetNode.y;
        return jerVar != null ? ivz.g(jerVar).o(jerVar, false) : ihu.a;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        jcr jcrVar;
        jer jerVar;
        jcr jcrVar2;
        jer jerVar2 = focusTargetNode.y;
        return (jerVar2 == null || (jcrVar = jerVar2.t) == null || !jcrVar.f() || (jerVar = focusTargetNode.y) == null || (jcrVar2 = jerVar.t) == null || !jcrVar2.d()) ? false : true;
    }
}
