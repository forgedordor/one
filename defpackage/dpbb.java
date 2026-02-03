package defpackage;

import com.google.android.libraries.compose.tenor.rest.MediaResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbb {
    public static final doyt b(MediaResult mediaResult) {
        return new doyt(mediaResult.getId(), mediaResult.title(), mediaResult.getUrl(), c(mediaResult.getMedia(), true), doar.a);
    }

    public static final List c(List list, boolean z) {
        list.getClass();
        Map map = (Map) fcva.N(list);
        List list2 = null;
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (fdgn.n((String) entry.getKey(), "_transparent")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (true == linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                List listD = d(linkedHashMap);
                if (true != listD.isEmpty()) {
                    list2 = listD;
                }
            }
        }
        return list2 == null ? d(map) : list2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List d(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbb.d(java.util.Map):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdkf r5, defpackage.fdap r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dpba
            if (r0 == 0) goto L13
            r0 = r7
            dpba r0 = (defpackage.dpba) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpba r0 = new dpba
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 == r1) goto L6b
        L3e:
            com.google.android.libraries.compose.tenor.rest.MediaResultsResponse r7 = (com.google.android.libraries.compose.tenor.rest.MediaResultsResponse) r7
            java.util.List r5 = r7.getResults()
            if (r5 == 0) goto L68
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.fcva.p(r5, r0)
            r7.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            java.lang.Object r0 = r6.invoke(r0)
            r7.add(r0)
            goto L55
        L67:
            return r7
        L68:
            fcvo r5 = defpackage.fcvo.a
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbb.a(fdkf, fdap, fcxy):java.lang.Object");
    }
}
