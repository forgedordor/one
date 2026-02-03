package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxz implements bzaf {
    private final bzad a;
    private final aurx c;
    private final apom d;
    private final apod e;
    private final fcsu f;

    public byxz(bzad bzadVar, aurx aurxVar, apom apomVar, apod apodVar, fcsu fcsuVar) {
        this.a = bzadVar;
        this.c = aurxVar;
        this.d = apomVar;
        this.e = apodVar;
        this.f = fcsuVar;
    }

    public static final bmqz c(int i) {
        if (i == byxy.a(4)) {
            return bmqz.BACKUP_UPDATE_URI;
        }
        if (i == byxy.a(5)) {
            return bmqz.BACKUP_UPDATE_RARE;
        }
        if (i == byxy.a(3)) {
            return bmqz.BACKUP_UPDATE_FREQUENT;
        }
        if (i == byxy.a(6)) {
            return bmqz.BACKUP_UPDATE_ADDITIONAL_FIELDS;
        }
        cqbd cqbdVarE = b.e();
        cqbdVarE.I("Failed to parse part operation from flags, returning unknown AbandonedAction");
        cqbdVarE.y("flags", i);
        cqbdVarE.r();
        return bmqz.BACKUP_UNKNOWN_OPERATION;
    }

    private static int d() {
        return cpyl.a() ? bzas.a(9) : byxy.a(5);
    }

    private final ekgb e() {
        final ArrayList arrayList = new ArrayList();
        ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: byxu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final List list = arrayList;
                Map.EL.forEach((java.util.Map) obj, new BiConsumer() { // from class: byxv
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        list.addAll(((cpvt) obj3).b());
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekgb.n(arrayList);
    }

    private static List f() {
        return ekjz.c("sender_id", "message_protocol", "mms_subject", "mms_transaction_id", "mms_expiry", "mms_retrieve_text", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", "rcs_file_transfer_session_id", "sms_error_code", "correlation_id", "is_hidden", "received_timestamp");
    }

    @Override // defpackage.bzaf
    public final List a() {
        if (this.c.aj()) {
            bzad bzadVar = this.a;
            int iA = byxy.a(3);
            bbml bbmlVar = bbml.UPDATE;
            bbmm bbmmVarA = bzadVar.a(1, bbmlVar, iA);
            bbmmVarA.d = ekgb.s("message_status", "seen");
            bbmmVarA.f = 5;
            bbmmVarA.a = byxy.b(3);
            String strA = bbmmVarA.a();
            bbmm bbmmVarA2 = bzadVar.a(1, bbmlVar, byxy.a(3));
            bbmmVarA2.b = 1;
            bbmmVarA2.d = ekjz.c("read");
            bbmmVarA2.b("NEW.read");
            bbmmVarA2.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
            bbmmVarA2.a = "read";
            bbmmVarA2.f = 5;
            String strA2 = bbmmVarA2.a();
            bbmm bbmmVarA3 = bzadVar.a(1, bbmlVar, byxy.a(5));
            bbmmVarA3.d = f();
            bbmmVarA3.a = byxy.b(5);
            bbmmVarA3.f = 5;
            String strA3 = bbmmVarA3.a();
            bbml bbmlVar2 = bbml.INSERT;
            bbmm bbmmVarA4 = bzadVar.b(5, bbmlVar2).a(1, "message_id");
            bbmmVarA4.g = byxy.a(5);
            String strA4 = bbmmVarA4.a();
            bzac bzacVarB = bzadVar.b(5, bbmlVar);
            Integer[] numArrB = cpyi.b();
            int length = numArrB.length;
            Integer[] numArr = new Integer[length + 1];
            System.arraycopy(numArrB, 0, numArr, 0, length);
            numArr[length] = Integer.valueOf(cpyi.RESTORED_FROM_CMS.ordinal());
            bbmm bbmmVarB = bzacVarB.b(1, "message_id", numArr);
            bbmmVarB.d = ekgb.r(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            bbmmVarB.g = byxy.a(4);
            bbmmVarB.f = 5;
            bbmmVarB.a = byxy.b(4);
            String strA5 = bbmmVarB.a();
            bbmm bbmmVar = new bbmm();
            bbml bbmlVar3 = bbml.DELETE;
            bbmmVar.c = bbmlVar3;
            bbmmVar.e = 32;
            bbmmVar.b = 5;
            bbmmVar.i = "message_id";
            bbmmVar.c();
            bbmmVar.g = d();
            bbmmVar.h = this.e.a();
            String strA6 = bbmmVar.a();
            bbmm bbmmVarA5 = bzadVar.b(4, bbmlVar2).a(1, "message_id");
            bbmmVarA5.g = byxy.a(5);
            bbmmVarA5.f = 5;
            String strA7 = bbmmVarA5.a();
            bbmm bbmmVarA6 = bzadVar.b(4, bbmlVar).a(1, "message_id");
            bbmmVarA6.g = byxy.a(5);
            bbmmVarA6.f = 5;
            String strA8 = bbmmVarA6.a();
            bbmm bbmmVarA7 = bzadVar.b(4, bbmlVar3).a(1, "message_id");
            bbmmVarA7.g = byxy.a(5);
            bbmmVarA7.f = 5;
            String strA9 = bbmmVarA7.a();
            bbmm bbmmVarA8 = bzadVar.b(8, bbmlVar2).a(1, "message_id");
            bbmmVarA8.g = byxy.a(5);
            bbmmVarA8.f = 5;
            String strA10 = bbmmVarA8.a();
            bbmm bbmmVarA9 = bzadVar.b(8, bbmlVar3).a(1, "message_id");
            bbmmVarA9.g = byxy.a(5);
            bbmmVarA9.f = 5;
            String strA11 = bbmmVarA9.a();
            bbmm bbmmVarA10 = bzadVar.b(9, bbmlVar2).a(1, "message_id");
            bbmmVarA10.g = byxy.a(5);
            bbmmVarA10.f = 5;
            String strA12 = bbmmVarA10.a();
            bbmm bbmmVarA11 = bzadVar.b(9, bbmlVar3).a(1, "message_id");
            bbmmVarA11.g = byxy.a(5);
            bbmmVarA11.f = 5;
            String strA13 = bbmmVarA11.a();
            bbmm bbmmVarA12 = bzadVar.b(9, bbmlVar).a(1, "message_id");
            bbmmVarA12.d = ekgb.s("conversation_suggestion_type", "properties");
            bbmmVarA12.g = byxy.a(5);
            bbmmVarA12.f = 5;
            ArrayList arrayList = new ArrayList(Arrays.asList(strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9, strA10, strA11, strA12, strA13, bbmmVarA12.a()));
            if (this.d.a() && cpyl.a()) {
                arrayList.addAll(e());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        bbmm bbmmVar2 = new bbmm();
        bbml bbmlVar4 = bbml.UPDATE;
        bbmmVar2.c = bbmlVar4;
        bbmmVar2.e = 32;
        bbmmVar2.b = 1;
        bbmmVar2.d = ekjz.c("message_status", "seen");
        bbmmVar2.a = byxy.b(3);
        bbmmVar2.f = 5;
        bbmmVar2.c();
        apod apodVar = this.e;
        bbmmVar2.h = apodVar.a();
        bbmmVar2.g = byxy.a(3);
        arrayList2.add(bbmmVar2.a());
        bbmm bbmmVar3 = new bbmm();
        bbmmVar3.c = bbmlVar4;
        bbmmVar3.a = "read";
        bbmmVar3.e = 32;
        bbmmVar3.b = 1;
        bbmmVar3.d = ekjz.c("read");
        bbmmVar3.f = 5;
        bbmmVar3.c();
        bbmmVar3.h = apodVar.a();
        bbmmVar3.g = byxy.a(3);
        bbmmVar3.b("NEW.read");
        bbmmVar3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList2.add(bbmmVar3.a());
        bbmm bbmmVar4 = new bbmm();
        bbmmVar4.c = bbmlVar4;
        bbmmVar4.e = 32;
        bbmmVar4.b = 1;
        bbmmVar4.d = f();
        bbmmVar4.a = byxy.b(5);
        bbmmVar4.f = 5;
        bbmmVar4.c();
        bbmmVar4.h = apodVar.a();
        bbmmVar4.g = byxy.a(5);
        arrayList2.add(bbmmVar4.a());
        bbmm bbmmVar5 = new bbmm();
        bbml bbmlVar5 = bbml.INSERT;
        bbmmVar5.c = bbmlVar5;
        bbmmVar5.e = 32;
        bbmmVar5.b = 5;
        bbmmVar5.i = "message_id";
        bbmmVar5.c();
        bbmmVar5.h = apodVar.a();
        bbmmVar5.g = byxy.a(5);
        arrayList2.add(bbmmVar5.a());
        bbmm bbmmVar6 = new bbmm();
        bbmmVar6.c = bbmlVar4;
        bbmmVar6.e = 32;
        bbmmVar6.b = 5;
        bbmmVar6.d = ekjz.c(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        bbmmVar6.a = byxy.b(4);
        bbmmVar6.i = "message_id";
        bbmmVar6.f = 5;
        bbmmVar6.c();
        bbmmVar6.h = apodVar.a();
        bbmmVar6.g = byxy.a(4);
        arrayList2.add(bbmmVar6.a());
        bbmm bbmmVar7 = new bbmm();
        bbml bbmlVar6 = bbml.DELETE;
        bbmmVar7.c = bbmlVar6;
        bbmmVar7.e = 32;
        bbmmVar7.b = 5;
        bbmmVar7.i = "message_id";
        bbmmVar7.c();
        bbmmVar7.h = apodVar.a();
        bbmmVar7.g = d();
        arrayList2.add(bbmmVar7.a());
        bbmm bbmmVar8 = new bbmm();
        bbmmVar8.c = bbmlVar5;
        bbmmVar8.e = 32;
        bbmmVar8.b = 4;
        bbmmVar8.f = 5;
        bbmmVar8.i = "message_id";
        bbmmVar8.c();
        bbmmVar8.h = apodVar.a();
        bbmmVar8.g = byxy.a(5);
        arrayList2.add(bbmmVar8.a());
        bbmm bbmmVar9 = new bbmm();
        bbmmVar9.c = bbmlVar4;
        bbmmVar9.e = 32;
        bbmmVar9.b = 4;
        bbmmVar9.f = 5;
        bbmmVar9.i = "message_id";
        bbmmVar9.c();
        bbmmVar9.h = apodVar.a();
        bbmmVar9.g = byxy.a(5);
        arrayList2.add(bbmmVar9.a());
        bbmm bbmmVar10 = new bbmm();
        bbmmVar10.c = bbmlVar6;
        bbmmVar10.e = 32;
        bbmmVar10.b = 4;
        bbmmVar10.f = 5;
        bbmmVar10.i = "message_id";
        bbmmVar10.c();
        bbmmVar10.h = apodVar.a();
        bbmmVar10.g = byxy.a(5);
        arrayList2.add(bbmmVar10.a());
        bbmm bbmmVar11 = new bbmm();
        bbmmVar11.c = bbmlVar5;
        bbmmVar11.e = 32;
        bbmmVar11.b = 8;
        bbmmVar11.f = 5;
        bbmmVar11.i = "message_id";
        bbmmVar11.c();
        bbmmVar11.h = apodVar.a();
        bbmmVar11.g = byxy.a(5);
        arrayList2.add(bbmmVar11.a());
        bbmm bbmmVar12 = new bbmm();
        bbmmVar12.c = bbmlVar6;
        bbmmVar12.e = 32;
        bbmmVar12.b = 8;
        bbmmVar12.f = 5;
        bbmmVar12.i = "message_id";
        bbmmVar12.c();
        bbmmVar12.h = apodVar.a();
        bbmmVar12.g = byxy.a(5);
        arrayList2.add(bbmmVar12.a());
        bbmm bbmmVar13 = new bbmm();
        bbmmVar13.c = bbmlVar5;
        bbmmVar13.e = 32;
        bbmmVar13.b = 9;
        bbmmVar13.f = 5;
        bbmmVar13.i = "message_id";
        bbmmVar13.c();
        bbmmVar13.h = apodVar.a();
        bbmmVar13.g = byxy.a(5);
        arrayList2.add(bbmmVar13.a());
        bbmm bbmmVar14 = new bbmm();
        bbmmVar14.c = bbmlVar6;
        bbmmVar14.e = 32;
        bbmmVar14.b = 9;
        bbmmVar14.f = 5;
        bbmmVar14.i = "message_id";
        bbmmVar14.c();
        bbmmVar14.h = apodVar.a();
        bbmmVar14.g = byxy.a(5);
        arrayList2.add(bbmmVar14.a());
        bbmm bbmmVar15 = new bbmm();
        bbmmVar15.c = bbmlVar4;
        bbmmVar15.e = 32;
        bbmmVar15.b = 9;
        bbmmVar15.d = ekjz.c("conversation_suggestion_type", "properties");
        bbmmVar15.f = 5;
        bbmmVar15.i = "message_id";
        bbmmVar15.c();
        bbmmVar15.h = apodVar.a();
        bbmmVar15.g = byxy.a(5);
        arrayList2.add(bbmmVar15.a());
        if (this.d.a() && cpyl.a()) {
            arrayList2.addAll(e());
        }
        return arrayList2;
    }

    @Override // defpackage.bzaf
    public final List b() {
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.UPDATE;
        String strB = byxy.b(3);
        bzad bzadVar = this.a;
        arrayList.add(bzadVar.d(1, bbmlVar, strB));
        arrayList.add(bzadVar.d(1, bbmlVar, byxy.b(5)));
        bbml bbmlVar2 = bbml.INSERT;
        arrayList.add(bzadVar.c(5, bbmlVar2));
        bbml bbmlVar3 = bbml.DELETE;
        arrayList.add(bzadVar.c(5, bbmlVar3));
        arrayList.add(bzadVar.d(5, bbmlVar, byxy.b(5)));
        arrayList.add(bzadVar.c(4, bbmlVar2));
        arrayList.add(bzadVar.c(4, bbmlVar3));
        arrayList.add(bzadVar.c(4, bbmlVar));
        arrayList.add(bzadVar.c(8, bbmlVar2));
        arrayList.add(bzadVar.c(8, bbmlVar3));
        arrayList.add(bzadVar.c(9, bbmlVar2));
        arrayList.add(bzadVar.c(9, bbmlVar3));
        arrayList.add(bzadVar.c(9, bbmlVar));
        arrayList.add(bzadVar.d(5, bbmlVar, byxy.b(4)));
        arrayList.add(bzadVar.d(1, bbmlVar, "read"));
        if (this.d.a() && cpyl.a()) {
            final ArrayList arrayList2 = new ArrayList();
            ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: byxw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final List list = arrayList2;
                    Map.EL.forEach((java.util.Map) obj, new BiConsumer() { // from class: byxx
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            list.addAll(((cpvt) obj3).c());
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            arrayList.addAll(ekgb.n(arrayList2));
        }
        return arrayList;
    }
}
