package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xgs extends fdbo implements fdap {
    public xgs(Object obj) {
        super(1, obj, xgt.class, "onReceiveContent", "onReceiveContent(Landroidx/core/view/ContentInfoCompat;)Landroidx/core/view/ContentInfoCompat;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Pair pairCreate;
        Pair pairCreate2;
        lcw lcwVar;
        ekrg ekrgVar;
        LinkedHashSet linkedHashSet;
        int i;
        String str;
        String str2;
        LinkedHashSet linkedHashSet2;
        doif doifVar;
        lcw lcwVar2 = (lcw) obj;
        lcwVar2.getClass();
        xgt xgtVar = (xgt) this.g;
        ekrg ekrgVar2 = xgt.a;
        ekrg ekrgVar3 = xgt.a;
        ekrw ekrwVarH = ekrgVar3.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        String str3 = "onReceiveContent";
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "onReceiveContent", 56, "ComposeRowContentInsertionListener.kt")).t("onReceiveContent %s", lcwVar2);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        int itemCount = lcwVar2.d().getItemCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < itemCount) {
            ClipData.Item itemAt = lcwVar2.d().getItemAt(i2);
            if (itemAt.getUri() != null) {
                ClipData.Item itemAt2 = lcwVar2.d().getItemAt(i2);
                Uri uri = itemAt2.getUri();
                if (uri == null) {
                    throw new IllegalArgumentException("A clip attachment must have an Uri");
                }
                ekrgVar = ekrgVar3;
                if (xgtVar.g.a()) {
                    i = itemCount;
                    ClipData clipDataD = lcwVar2.d();
                    clipDataD.getClass();
                    doig doigVarB = xgtVar.b(clipDataD, i2);
                    lcwVar = lcwVar2;
                    vth vthVar = xgtVar.f;
                    str = str3;
                    dltc dltcVarA = xgtVar.a(lcwVar.b(), uri);
                    if (doigVarB != null) {
                        linkedHashSet2 = linkedHashSet3;
                        doifVar = doigVarB.b;
                    } else {
                        linkedHashSet2 = linkedHashSet3;
                        doifVar = null;
                    }
                    vvl vvlVarI = vthVar.i(dltcVarA, doifVar);
                    itemAt2.getClass();
                    if (doigVarB == null) {
                        doigVarB = xgtVar.c(uri);
                    }
                    doig doigVar = doigVarB;
                    if (doigVar == null) {
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleComposeRow2");
                        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "improvedAddAttachment", 130, "ComposeRowContentInsertionListener.kt")).t("Skipping received content with no MediaType: %s", itemAt2);
                    } else {
                        vvo vvoVar = new vvo(vvlVarI, doigVar, uri, null, xgtVar.a(lcwVar.b(), uri));
                        if (xgtVar.f(doigVar)) {
                            ekrw ekrwVarE = ekrgVar.e();
                            ekrwVarE.X(ekrzVar, "BugleComposeRow2");
                            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "improvedAddAttachment", 148, "ComposeRowContentInsertionListener.kt")).D("Accepting received content with MediaType %s: %s", doigVar, itemAt2);
                            xgtVar.e(vvoVar);
                            itemAt.getClass();
                            linkedHashSet = linkedHashSet2;
                            linkedHashSet.add(itemAt);
                            i3++;
                            str2 = str;
                        } else {
                            ekrw ekrwVarH3 = ekrgVar.h();
                            ekrwVarH3.X(ekrzVar, "BugleComposeRow2");
                            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "improvedAddAttachment", 144, "ComposeRowContentInsertionListener.kt")).D("Skipping received content with MediaType %s: %s", doigVar, itemAt2);
                            vthVar.b(vvoVar, i3);
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    lcwVar = lcwVar2;
                    linkedHashSet2 = linkedHashSet3;
                    i = itemCount;
                    str = str3;
                    ClipData clipDataD2 = lcwVar.d();
                    clipDataD2.getClass();
                    doig doigVarB2 = xgtVar.b(clipDataD2, i2);
                    if (doigVarB2 == null) {
                        doigVarB2 = xgtVar.c(uri);
                    }
                    if (doigVarB2 == null || !xgtVar.f(doigVarB2)) {
                        linkedHashSet = linkedHashSet2;
                        ekrw ekrwVarH4 = ekrgVar.h();
                        ekrwVarH4.X(ekrzVar, "BugleComposeRow2");
                        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "addAttachment", 102, "ComposeRowContentInsertionListener.kt")).D("Skipping received content with MediaType %s: %s", doigVarB2, itemAt2);
                    } else {
                        ekrw ekrwVarE2 = ekrgVar.e();
                        ekrwVarE2.X(ekrzVar, "BugleComposeRow2");
                        ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "addAttachment", 105, "ComposeRowContentInsertionListener.kt")).D("Accepting received content with MediaType %s: %s", doigVarB2, itemAt2);
                        dltc dltcVarA2 = xgtVar.a(lcwVar.b(), uri);
                        vuc vucVar = xgtVar.h;
                        xgtVar.e(new vvo(vuc.a(), doigVarB2, uri, null, dltcVarA2));
                        itemAt.getClass();
                        linkedHashSet = linkedHashSet2;
                        linkedHashSet.add(itemAt);
                        i3++;
                        str2 = str;
                    }
                }
                i2++;
                str3 = str2;
                ekrgVar3 = ekrgVar;
                itemCount = i;
                linkedHashSet3 = linkedHashSet;
                lcwVar2 = lcwVar;
            } else {
                lcwVar = lcwVar2;
                ekrgVar = ekrgVar3;
                linkedHashSet = linkedHashSet3;
                i = itemCount;
                str = str3;
            }
            CharSequence text = itemAt.getText();
            if (text == null || text.length() == 0) {
                ekrw ekrwVarH5 = ekrgVar.h();
                ekrwVarH5.X(ekrzVar, "BugleComposeRow2");
                str2 = str;
                ((ekrd) ekrwVarH5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", str2, 68, "ComposeRowContentInsertionListener.kt")).t("Skipping received content with null uri and text: %s", itemAt);
                i2++;
                str3 = str2;
                ekrgVar3 = ekrgVar;
                itemCount = i;
                linkedHashSet3 = linkedHashSet;
                lcwVar2 = lcwVar;
            } else {
                itemAt.getClass();
                CharSequence text2 = itemAt.getText();
                if (text2 == null || text2.length() == 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ((dnih) xgtVar.e.b()).g(text2);
                linkedHashSet.add(itemAt);
                str2 = str;
                i2++;
                str3 = str2;
                ekrgVar3 = ekrgVar;
                itemCount = i;
                linkedHashSet3 = linkedHashSet;
                lcwVar2 = lcwVar;
            }
        }
        lcw lcwVar3 = lcwVar2;
        final LinkedHashSet linkedHashSet4 = linkedHashSet3;
        lci lciVar = new lci() { // from class: xgn
            @Override // defpackage.lci
            public final /* synthetic */ lci a(lci lciVar2) {
                return new lch(this, lciVar2);
            }

            @Override // defpackage.lci
            public final boolean b(Object obj3) {
                ekrg ekrgVar4 = xgt.a;
                return !linkedHashSet4.contains((ClipData.Item) obj3);
            }
        };
        lcw lcwVar4 = lcwVar3;
        ClipData clipDataC = lcwVar4.a.c();
        if (clipDataC.getItemCount() == 1) {
            boolean zB = lciVar.b(clipDataC.getItemAt(0));
            lcw lcwVar5 = true != zB ? null : lcwVar4;
            if (true == zB) {
                lcwVar4 = null;
            }
            pairCreate2 = Pair.create(lcwVar5, lcwVar4);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i4 = 0; i4 < clipDataC.getItemCount(); i4++) {
                ClipData.Item itemAt3 = clipDataC.getItemAt(i4);
                if (lciVar.b(itemAt3)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt3);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt3);
                }
            }
            if (arrayList == null) {
                obj2 = null;
                pairCreate = Pair.create(null, clipDataC);
            } else {
                obj2 = null;
                pairCreate = arrayList2 == null ? Pair.create(clipDataC, null) : Pair.create(lcw.c(clipDataC.getDescription(), arrayList), lcw.c(clipDataC.getDescription(), arrayList2));
            }
            if (pairCreate.first == null) {
                pairCreate2 = Pair.create(obj2, lcwVar4);
            } else if (pairCreate.second == null) {
                pairCreate2 = Pair.create(lcwVar4, obj2);
            } else {
                lcr lcqVar = Build.VERSION.SDK_INT >= 31 ? new lcq(lcwVar4) : new lcs(lcwVar4);
                lcp.b((ClipData) pairCreate.first, lcqVar);
                lcw lcwVarA = lcp.a(lcqVar);
                lcr lcqVar2 = Build.VERSION.SDK_INT >= 31 ? new lcq(lcwVar4) : new lcs(lcwVar4);
                lcp.b((ClipData) pairCreate.second, lcqVar2);
                pairCreate2 = Pair.create(lcwVarA, lcp.a(lcqVar2));
            }
        }
        return (lcw) pairCreate2.first;
    }
}
