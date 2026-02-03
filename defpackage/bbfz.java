package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfz {
    public final fcsu a;
    private final dqsn b;

    public bbfz(dqsn dqsnVar, fcsu fcsuVar) {
        this.b = dqsnVar;
        this.a = fcsuVar;
    }

    public static bpun a(final String str) {
        String[] strArr = bput.a;
        bpuo bpuoVar = new bpuo(bput.a);
        bpuoVar.A("getParticipantManualLinkPreviewCount");
        bpuoVar.k(new bpur((bpus) new Function() { // from class: bbfr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpus bpusVar = (bpus) obj;
                bpusVar.b(Long.parseLong(str));
                return bpusVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpus())));
        bpue[] bpueVarArr = {(bpue) new Function() { // from class: bbfs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bpud) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bput.c)};
        int iA = bput.b().a();
        Integer.valueOf(iA).getClass();
        if (((Integer) bput.b.getOrDefault(bpueVarArr[0].toString(), -1)).intValue() > iA) {
            dqru.x("columnReference.toString()", iA);
        }
        bpuoVar.m(bpueVarArr);
        return bpuoVar.b();
    }

    public static final Optional c(final MessageIdType messageIdType) {
        Optional optionalEmpty;
        eieu eieuVarK = eiiy.k("LinkPreviewDatabaseOperations#getLinkPreviewDataByMessageId");
        try {
            cqaz.h();
            cqaz.h();
            bpxe bpxeVarB = bpxj.b();
            bpxeVarB.A("getLinkPreviewData");
            bpxeVarB.e(new Function() { // from class: bbfy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpxi bpxiVar = (bpxi) obj;
                    bpxiVar.b(messageIdType);
                    return bpxiVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bpwk bpwkVar = (bpwk) bpxeVarB.b().p();
            try {
                if (bpwkVar.moveToNext()) {
                    optionalEmpty = Optional.of((bpvd) bpwkVar.cQ());
                    bpwkVar.close();
                } else {
                    bpwkVar.close();
                    optionalEmpty = Optional.empty();
                }
                eieuVarK.close();
                return optionalEmpty;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long d(String str) {
        long jLongValue;
        eieu eieuVarK = eiiy.k("LinkPreviewDatabaseOperations#getParticipantManualLinkPreviewCount");
        try {
            cqaz.h();
            if (str == null) {
                jLongValue = -1;
            } else {
                bpuf bpufVar = (bpuf) a(str).q(bput.c.c);
                try {
                    ekgb ekgbVarC = bpufVar.c();
                    bpufVar.close();
                    jLongValue = ekgbVarC.isEmpty() ? 0L : ((Long) ekgbVarC.get(0)).longValue();
                } finally {
                }
            }
            eieuVarK.close();
            return jLongValue;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final bpvd bpvdVar, final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("LinkPreviewDatabaseOperations#insertOrReplaceLinkPreviewData");
        try {
            cqaz.h();
            this.b.d("LinkPreviewDatabaseOperations#insertOrReplaceLinkPreviewData", new Runnable() { // from class: bbfu
                @Override // java.lang.Runnable
                public final void run() {
                    final bpvd bpvdVar2 = bpvdVar;
                    if (bbfz.c(bpvdVar2.m()).isPresent()) {
                        eieu eieuVarK2 = eiiy.k("LinkPreviewDatabaseOperations#updateLinkPreview");
                        try {
                            cqaz.h();
                            String[] strArr = bpxj.a;
                            bpxg bpxgVar = new bpxg();
                            bpxgVar.ap("updateLinkPreview");
                            String strS = bpvdVar2.s();
                            ContentValues contentValues = bpxgVar.a;
                            dqru.v(contentValues, "trigger_url", strS);
                            contentValues.put("expiration_time_millis", Long.valueOf(bpvdVar2.k()));
                            dqru.v(contentValues, "link_title", cssq.a(bpvdVar2.r()));
                            dqru.v(contentValues, "link_description", cssq.a(bpvdVar2.o()));
                            dqru.v(contentValues, "link_image_url", bpvdVar2.q());
                            dqru.v(contentValues, "link_domain", bpvdVar2.p());
                            dqru.v(contentValues, "link_canonical_url", bpvdVar2.n());
                            boolean zY = bpvdVar2.y();
                            int iIntValue = bpxj.d().intValue();
                            int iIntValue2 = bpxj.d().intValue();
                            if (iIntValue2 < 21010) {
                                dqru.x("link_preview_prevented", iIntValue2);
                            }
                            if (iIntValue >= 21010) {
                                contentValues.put("link_preview_prevented", Boolean.valueOf(zY));
                            }
                            boolean zX = bpvdVar2.x();
                            int iIntValue3 = bpxj.d().intValue();
                            int iIntValue4 = bpxj.d().intValue();
                            if (iIntValue4 < 22020) {
                                dqru.x("link_preview_failed", iIntValue4);
                            }
                            if (iIntValue3 >= 22020) {
                                contentValues.put("link_preview_failed", Boolean.valueOf(zX));
                            }
                            boolean zW = bpvdVar2.w();
                            int iIntValue5 = bpxj.d().intValue();
                            int iIntValue6 = bpxj.d().intValue();
                            if (iIntValue6 < 61000) {
                                dqru.x("deferred", iIntValue6);
                            }
                            if (iIntValue5 >= 61000) {
                                contentValues.put("deferred", Boolean.valueOf(zW));
                            }
                            bpxgVar.af(new bpxh((bpxi) new Function() { // from class: bbft
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bpxi bpxiVar = (bpxi) obj;
                                    bpxiVar.b(bpvdVar2.m());
                                    return bpxiVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bpxi())));
                            bpxgVar.b().e();
                            eieuVarK2.close();
                        } catch (Throwable th) {
                            try {
                                eieuVarK2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        final dqsy dqsyVarC = bpxj.c();
                        dqru.b(bpxj.c(), "link_preview", bpvdVar2, new Function() { // from class: bpvb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarC.O("link_preview", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bpuw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                bpvdVar2.t((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    ((bxlc) this.a.a.b()).l(conversationIdType, bpvdVar2.m(), "link_preview");
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
