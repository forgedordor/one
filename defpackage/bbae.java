package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbae {
    private static final cqce d = cqce.g("BugleDataModel", "MessagePartDatabaseOperations");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu e;
    private final fcsu f;

    public bbae(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.e = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.f = fcsuVar4;
        this.c = fcsuVar5;
    }

    public final MessagePartCoreData a(String str) {
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperations#readMessagePartData partId");
        try {
            Function function = new Function() { // from class: bazz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bahv) this.a.a.b()).e((PartsTable.BindData) obj);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            PartsTable.BindData bindDataA = PartsTable.a(str);
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) (bindDataA != null ? function.apply(bindDataA) : null);
            eieuVarK.close();
            return messagePartCoreData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(MessageCoreData messageCoreData, List list, boolean z) {
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperationsImpl#addMessageParts");
        try {
            ContentResolver contentResolver = ((Context) this.e.b()).getContentResolver();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                Uri uriT = messagePartCoreData.t();
                if (!z || !messagePartCoreData.aX() || uriT == null || cqmz.m(uriT)) {
                    messageCoreData.aM(messagePartCoreData);
                } else {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriT, "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            messageCoreData.aM(messagePartCoreData);
                        }
                    } catch (IOException unused) {
                    } catch (SecurityException unused2) {
                        cqbd cqbdVarA = d.a();
                        cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uriT);
                        cqbdVarA.r();
                    }
                }
            }
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

    public final void c(final MessageCoreData messageCoreData, boolean z) {
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperationsImpl#readMessagePartData message");
        try {
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("readMessagePartData");
            bsjeVarC.h(new Function() { // from class: bazm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.n(messageCoreData.C());
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream map = Collection.EL.stream(bsjeVarC.b().z()).map(new Function() { // from class: bazn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bahv) this.a.a.b()).e((PartsTable.BindData) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            b(messageCoreData, (List) map.collect(ekcv.a), z);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final MessagePartCoreData messagePartCoreData, String str) {
        String strM = messagePartCoreData.M();
        if ((ejwk.c(str) && ejwk.c(strM)) || cssr.f(str, strM)) {
            return;
        }
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperationsImpl#resetBlobUploadMetadataOnGaiaEmailChange");
        try {
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("resetBlobUploadMetadataOnGaiaEmailChange");
            int iIntValue = PartsTable.e().intValue();
            int iIntValue2 = PartsTable.e().intValue();
            if (iIntValue2 < 59570) {
                dqru.x("blob_gaia_email", iIntValue2);
            }
            if (iIntValue >= 59570) {
                dqru.v(bsjhVar.a, "blob_gaia_email", str);
            }
            bsjhVar.e();
            ContentValues contentValues = bsjhVar.a;
            contentValues.putNull("blob_upload_timestamp");
            contentValues.putNull("blob_upload_permanent_failure");
            contentValues.putNull("media_encryption_key");
            contentValues.putNull("compressed_blob_id");
            contentValues.putNull("compressed_blob_upload_timestamp");
            contentValues.putNull("compressed_media_encryption_key");
            contentValues.putNull("compressed_blob_upload_permanent_failure");
            bsjhVar.am();
            bsjhVar.D(new Function() { // from class: bazp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.j(messagePartCoreData.W());
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bsjg bsjgVarA = bsjhVar.b();
            ekgb ekgbVar = (ekgb) PartsTable.d().p("updateAndReturnUpdatedRowsAfterUpdate-txn-parts", new ejxr() { // from class: bsjf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejxr
                public final Object get() {
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.A("updateAndReturnUpdatedRowsAfterUpdate-pre-parts");
                    bsjeVarC.v();
                    bsjeVarC.n(new dqxl("ROWID", new Object[0]), "_rowid");
                    bsjg bsjgVar = bsjgVarA;
                    ekgb ekgbVar2 = bsjgVar.e;
                    int i = ((ekoe) ekgbVar2).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        bsjeVarC.k((bsji) ((dqyj) ekgbVar2.get(i2)));
                    }
                    if (((dqpb) bsjgVar.d).b) {
                        bsjl bsjlVar = new bsjl();
                        bsjlVar.ar(bsjgVar.h());
                        bsjeVarC.g(bsjlVar);
                    }
                    ekfw ekfwVar = new ekfw();
                    bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                    while (bsgtVar.moveToNext()) {
                        try {
                            ekfwVar.h(bsgtVar.de("_rowid"));
                        } catch (Throwable th) {
                            try {
                                bsgtVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bsgtVar.close();
                    String str2 = (String) Collection.EL.stream(ekfwVar.g()).collect(Collectors.joining(","));
                    bsjgVar.e();
                    bsje bsjeVarC2 = PartsTable.c();
                    bsjeVarC2.A("updateAndReturnUpdatedRowsAfterUpdate-post-parts");
                    bsjl bsjlVar2 = new bsjl();
                    bsjlVar2.ar(new dqxl("ROWID IN ($R)", new Object[]{str2}));
                    bsjeVarC2.g(bsjlVar2);
                    return bsjeVarC2.b().z();
                }
            });
            if (ekgbVar.size() == 1) {
                messagePartCoreData.aM((PartsTable.BindData) ekgbVar.get(0));
            } else {
                d.r("Unexpected bindData size returned in resetBlobUploadMetadataOnGaiaEmailChange");
            }
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

    public final void e(final MessageCoreData messageCoreData, final MessagePartCoreData messagePartCoreData, Uri uri, final Uri uri2) {
        boolean z = true;
        if (!messagePartCoreData.B().c() && !messageCoreData.C().equals(messagePartCoreData.B())) {
            z = false;
        }
        ejwl.a(z);
        if (((Boolean) ((dqsn) this.c.b()).c("MessagePartDatabaseOperations#updatePartContentUriAndClearCache", new ejxr() { // from class: bbac
            @Override // defpackage.ejxr
            public final Object get() {
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                MessageCoreData messageCoreData2 = messageCoreData;
                ConversationIdType conversationIdTypeA = messageCoreData2.A();
                MessageIdType messageIdTypeC = messageCoreData2.C();
                String strW = messagePartCoreData2.W();
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("updatePartContentUriAndRemoveFromScratch");
                Uri uri3 = uri2;
                bsjhVar.z(uri3);
                final bbae bbaeVar = this.a;
                boolean zF = bbaeVar.f(conversationIdTypeA, messageIdTypeC, strW, bsjhVar);
                if (zF) {
                    messagePartCoreData2.ar(uri3);
                }
                ((dqsn) bbaeVar.c.b()).g(new dqsm() { // from class: bazd
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("BDOI::onPartInsertedSync::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: bazo
                    @Override // java.lang.Runnable
                    public final void run() {
                        awlc awlcVar = (awlc) bbaeVar.b.b();
                        final MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        awlcVar.d(new Consumer() { // from class: bazh
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ((cnos) obj).c(messagePartCoreData3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
                return Boolean.valueOf(zF);
            }
        })).booleanValue()) {
            if (messagePartCoreData.K() != elha.GIF_CHOOSER) {
                bxlf.i((Context) this.e.b(), uri);
            }
        } else {
            cqbd cqbdVarE = d.e();
            cqbdVarE.I("Failed to update part content uri");
            cqbdVarE.d(messageCoreData.C());
            cqbdVarE.r();
        }
    }

    public final boolean f(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, bsjh bsjhVar) {
        return g(conversationIdType, messageIdType, str, bsjhVar, true);
    }

    public final boolean g(ConversationIdType conversationIdType, MessageIdType messageIdType, final String str, bsjh bsjhVar, boolean z) {
        boolean z2;
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperationsImpl#updatePartRowIfExists");
        try {
            cqaz.h();
            bsjhVar.am();
            bsjhVar.D(new Function() { // from class: bazi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.j(str);
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (bsjhVar.b().e() == 0) {
                z2 = false;
            } else {
                if (z) {
                    if (str != null) {
                        ((dqsn) this.c.b()).g(new dqsm() { // from class: bazj
                            @Override // defpackage.dqsm
                            public final eieu a() {
                                return eiiy.k("MPDO::onPartUpdated::runAfterCommit");
                            }
                        }, null, new Runnable() { // from class: bazk
                            @Override // java.lang.Runnable
                            public final void run() {
                                awlc awlcVar = (awlc) this.a.b.b();
                                final String str2 = str;
                                awlcVar.d(new Consumer() { // from class: bbad
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        ((cnos) obj).d(str2);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                        });
                    }
                    bxlc bxlcVar = (bxlc) this.f.b();
                    String[] strArr = PartsTable.a;
                    bxlcVar.l(conversationIdType, messageIdType, "parts");
                }
                z2 = true;
            }
            eieuVarK.close();
            return z2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean h(final String str, bsjh bsjhVar) {
        boolean z;
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperationsImpl#updatePartRowIfExistsWithPartId");
        try {
            bsjhVar.am();
            bsjhVar.D(new Function() { // from class: bazq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.j(str);
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iE = bsjhVar.b().e();
            ecem.b();
            if (iE == 0) {
                z = false;
            } else {
                ((dqsn) this.c.b()).g(new dqsm() { // from class: bazr
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("MPDO::onPartUpdated::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: bazs
                    @Override // java.lang.Runnable
                    public final void run() {
                        awlc awlcVar = (awlc) this.a.b.b();
                        final String str2 = str;
                        awlcVar.d(new Consumer() { // from class: bazl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ((cnos) obj).d(str2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
                z = true;
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, Uri uri) {
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperations#updateMessagePartContentUri");
        try {
            ecem.b();
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("updateMessagePartContentUri");
            bsjhVar.z(uri);
            bsjhVar.u(null);
            f(conversationIdType, messageIdType, str, bsjhVar);
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
