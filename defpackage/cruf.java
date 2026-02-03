package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cruf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/SpamReporter");
    public static final ejxr b = cdag.x("spam_reporter_kt_fix_undo_archive_status");
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final cpgf f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final dqsn k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;

    public cruf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cpgf cpgfVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, dqsn dqsnVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cpgfVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar8.getClass();
        dqsnVar.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = cpgfVar;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = dqsnVar;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
    }

    public final bvdk a(boolean z, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        bojh bojhVarR;
        if (z) {
            return bvdk.SPAM_FOLDER;
        }
        bvdk bvdkVar = bvdk.UNARCHIVED;
        return (bindData == null || (bojhVarR = ((bakt) this.h.b()).r(conversationIdType)) == null || bojhVarR.q() != 1 || !bindData.X()) ? bvdkVar : bvdk.BLOCKED_FOLDER;
    }

    public final crvl b(final crui cruiVar) {
        ecem.b();
        final crvk crvkVar = (crvk) crvl.a.createBuilder();
        crvkVar.copyOnWrite();
        crvl crvlVar = (crvl) crvkVar.instance;
        crvlVar.b |= 32;
        crvlVar.h = cruiVar.e;
        crvkVar.copyOnWrite();
        crvl crvlVar2 = (crvl) crvkVar.instance;
        crvlVar2.b |= 64;
        crvlVar2.i = cruiVar.f;
        int iA = eofq.a(cruiVar.m);
        crvkVar.copyOnWrite();
        crvl crvlVar3 = (crvl) crvkVar.instance;
        crvlVar3.b |= 128;
        crvlVar3.j = iA;
        return (crvl) this.k.c("SpamReporter#updateAndReportSpamStatus", new ejxr() { // from class: crtx
            /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 479
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.crtx.get():java.lang.Object");
            }
        });
    }
}
