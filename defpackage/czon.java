package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czon implements egyi {
    final /* synthetic */ boolean a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ czoo e;

    public czon(czoo czooVar, boolean z, ConversationIdType conversationIdType, String str, boolean z2) {
        this.a = z;
        this.b = conversationIdType;
        this.c = str;
        this.d = z2;
        this.e = czooVar;
    }

    @Override // defpackage.egyi
    public final eopy a() throws Throwable {
        eieu eieuVarK = eiiy.k("MessageDataSource#SearchMediaViewerDataSourceFactoryImpl#LoadData");
        try {
            final boolean z = this.a;
            final ConversationIdType conversationIdType = this.b;
            final String str = this.c;
            final boolean z2 = this.d;
            try {
                eopy eopyVarE = new eopy(eijx.g(new Callable() { // from class: czol
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ConversationId conversationIdA;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        String str2 = str;
                        czon czonVar = this.a;
                        boolean z3 = z;
                        boolean z4 = z2;
                        biwf biwfVarR = z3 ? czonVar.e.b.r(conversationIdType2, str2, z4) : czonVar.e.b.p(conversationIdType2, str2, z4);
                        try {
                            ArrayList arrayList = new ArrayList();
                            ekqh it = biwfVarR.cZ(new Supplier() { // from class: czok
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new MediaSearchResult();
                                }
                            }).iterator();
                            while (it.hasNext()) {
                                MediaSearchResult mediaSearchResult = (MediaSearchResult) it.next();
                                final czoo czooVar = czonVar.e;
                                daig daigVar = czooVar.c;
                                String strB = daigVar.b(mediaSearchResult.g());
                                Uri uriH = mediaSearchResult.h();
                                String strK = mediaSearchResult.k();
                                if (uriH == null) {
                                    throw new IllegalStateException("URI from result is null, cannot display media.");
                                }
                                if (strK == null) {
                                    throw new IllegalStateException("Content type from result is null, cannot display media.");
                                }
                                cznv cznvVar = new cznv();
                                cznvVar.c(uriH);
                                cznvVar.b(strK);
                                cznvVar.b = daigVar.e(mediaSearchResult.f(), mediaSearchResult.l(), Optional.ofNullable(mediaSearchResult.n()).map(new Function() { // from class: czoj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((alrj) czooVar.d.b()).n((String) obj);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }));
                                cznvVar.c = strB;
                                cznvVar.d = mediaSearchResult.i();
                                ConversationIdType conversationIdTypeI = mediaSearchResult.i();
                                CoreBugleMessageId coreBugleMessageId = null;
                                if (conversationIdTypeI == null) {
                                    conversationIdA = null;
                                } else {
                                    ajsn ajsnVar = czooVar.e;
                                    String strN = mediaSearchResult.n();
                                    mediaSearchResult.aA(21, "has_ea2p_bot_recipient");
                                    conversationIdA = ajsnVar.a(conversationIdTypeI, strN, mediaSearchResult.e);
                                }
                                cznvVar.e = conversationIdA;
                                cznvVar.f = mediaSearchResult.j();
                                MessageIdType messageIdTypeJ = mediaSearchResult.j();
                                if (messageIdTypeJ != null) {
                                    try {
                                        coreBugleMessageId = new CoreBugleMessageId(messageIdTypeJ, Long.parseLong(mediaSearchResult.m()));
                                    } catch (NumberFormatException unused) {
                                        coreBugleMessageId = new CoreBugleMessageId(messageIdTypeJ, -1L);
                                    }
                                }
                                cznvVar.g = coreBugleMessageId;
                                arrayList.add(cznvVar.a());
                            }
                            biwfVarR.close();
                            return arrayList;
                        } catch (Throwable th) {
                            try {
                                biwfVarR.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, this.e.a)).e(eiid.g(new eopo() { // from class: czom
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj) {
                        return egyh.a((List) obj, this.a.e.f.f());
                    }
                }), eoqg.a);
                eieuVarK.a(eopyVarE);
                eieuVarK.close();
                return eopyVarE;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    eieuVarK.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        return eijx.e(null);
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ Object c() {
        return String.format("search_media_viewer_content_key,convId=%s,participantId=%s", this.b, this.c);
    }
}
