package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anuv {
    public static final void a(anuw anuwVar, boip boipVar) {
        dqqj dqqjVarP = boipVar.p();
        try {
            boie boieVar = (boie) dqqjVarP;
            while (boieVar.moveToNext()) {
                anuwVar.a.add(new BugleConversationId(boieVar.e()));
            }
            fczl.a(dqqjVarP, null);
        } finally {
        }
    }

    public static final void b(anuw anuwVar, bsbo bsboVar) {
        dqqj dqqjVarP = bsboVar.b().p();
        try {
            brzj brzjVar = (brzj) dqqjVarP;
            while (brzjVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) brzjVar.cQ();
                if (bindData.r() > -2) {
                    anuwVar.b.set(true);
                } else {
                    String[] strArr = boiv.a;
                    Iterator itA = fdbd.a((bohm[]) bindData.aH("conversation_to_participants", new bohm[0]));
                    while (itA.hasNext()) {
                        anuwVar.a.add(new BugleConversationId(((bohm) itA.next()).n()));
                    }
                }
            }
            fczl.a(dqqjVarP, null);
        } finally {
        }
    }

    public static final void c(anuw anuwVar, bsun bsunVar) {
        dqqj dqqjVarP = bsunVar.b().p();
        try {
            bstl bstlVar = (bstl) dqqjVarP;
            while (bstlVar.moveToNext()) {
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) bstlVar.cQ();
                String[] strArr = boiv.a;
                Iterator itA = fdbd.a((bohm[]) bindData.aH("conversation_to_participants", new bohm[0]));
                while (itA.hasNext()) {
                    anuwVar.a.add(new BugleConversationId(((bohm) itA.next()).n()));
                }
            }
            fczl.a(dqqjVarP, null);
        } finally {
        }
    }

    public static final void d(bsbo bsboVar) {
        String[] strArr = boiv.a;
        bsboVar.H(dqts.i(new boiq(boiv.a).b(), boiv.c.b, ParticipantsTable.c.a).g());
    }

    public static final void e(bsun bsunVar) {
        String[] strArr = boiv.a;
        bsunVar.H(dqts.i(new boiq(boiv.a).b(), boiv.c.b, ProfilesTable.c.b).g());
    }
}
