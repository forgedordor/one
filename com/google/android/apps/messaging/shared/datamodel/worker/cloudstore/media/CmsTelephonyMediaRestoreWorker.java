package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsTelephonyMediaRestoreWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bzto;
import defpackage.cpyl;
import defpackage.cqce;
import defpackage.ehli;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.eooy;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.pzs;
import defpackage.qam;
import defpackage.qaq;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsTelephonyMediaRestoreWorker extends qaq {
    public static final cqce e = cqce.g("BugleCms", "CmsTelephonyMediaRestoreWorker");
    public final bzto f;
    private final eosc g;

    /* compiled from: PG */
    public interface a {
        bzto bM();

        eosc q();
    }

    public CmsTelephonyMediaRestoreWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.f = aVar.bM();
        this.g = aVar.q();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        final pzs pzsVarF = f();
        final int iA = pzsVarF.a("media_restore_max_retry_key", ((Integer) cpyl.e.e()).intValue());
        if (e() > iA) {
            return eijx.e(new qam(pzsVarF));
        }
        eiju eijuVarH = eijx.h(new eooy() { // from class: bztk
            @Override // defpackage.eooy
            public final ListenableFuture a() throws NumberFormatException {
                pzs pzsVar = pzsVarF;
                String strD = pzsVar.d("part_id_key");
                String strD2 = pzsVar.d("parent_message_uri_key");
                final Uri uri = strD2 != null ? Uri.parse(strD2) : null;
                int iA2 = pzsVar.a("account_id", -1);
                ejwl.b(!TextUtils.isEmpty(strD), "Empty partId get from work data");
                ejwl.b(uri != null, "Null message uri from work data");
                uri.getClass();
                try {
                    strD.getClass();
                    Long.parseLong(strD);
                    final PartsTable.BindData bindDataA = PartsTable.a(strD);
                    if (bindDataA == null) {
                        return eijx.e(false);
                    }
                    if (iA2 == -1) {
                        throw new IllegalArgumentException("AccountId in the workItem is invalid or missing");
                    }
                    final bzto bztoVar = this.a.f;
                    return bztoVar.b.b(iA2).i(new eooz() { // from class: bztn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            efwo efwoVar = (efwo) obj;
                            final HashMap map = new HashMap();
                            final bzrd bzrdVar = bztoVar.a;
                            final PartsTable.BindData bindData = bindDataA;
                            String strG = bindData.G();
                            final String strI = bindData.I();
                            final ConversationIdType conversationIdTypeU = bindData.u();
                            final MessageIdType messageIdTypeV = bindData.v();
                            final String strK = bindData.K();
                            byte[] bArrQ = bindData.Q();
                            if (strI == null || messageIdTypeV.c() || TextUtils.isEmpty(strG)) {
                                if (((Boolean) ((cczi) cpxw.n.get()).e()).booleanValue()) {
                                    bzrdVar.j.b(bvdl.CMS_MEDIA_DOWNLOAD_FAILED, conversationIdTypeU, messageIdTypeV, strK);
                                } else {
                                    bzrdVar.a(false, conversationIdTypeU, messageIdTypeV, strK);
                                }
                                return eijx.e(false);
                            }
                            final Uri uri2 = uri;
                            eiju eijuVarG = eiju.g(bzrdVar.a.a(strG, bArrQ, efwoVar));
                            eooz eoozVar = new eooz() { // from class: bzrb
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final bzrd bzrdVar2 = bzrdVar;
                                    Context context = bzrdVar2.i;
                                    Uri uri3 = (Uri) obj2;
                                    FileInputStream fileInputStream = new FileInputStream(bxlf.h(uri3, context));
                                    Map map2 = map;
                                    map2.put(uri3, fileInputStream);
                                    lt ltVar = new lt();
                                    ltVar.e = uri3;
                                    ltVar.h(strI.getBytes());
                                    final PartsTable.BindData bindData2 = bindData;
                                    String strJ = bindData2.J();
                                    if (strJ != null) {
                                        ltVar.k(strJ.getBytes());
                                    }
                                    final String str = strK;
                                    final MessageIdType messageIdType = messageIdTypeV;
                                    ConversationIdType conversationIdType = conversationIdTypeU;
                                    final Uri uriB = bzrdVar2.e.b(ltVar, ContentUris.parseId(uri2), map2);
                                    bxlf.i(context, uri3);
                                    if (((Boolean) ((cczi) cpxw.n.get()).e()).booleanValue()) {
                                        bzrdVar2.j.b(bvdl.CMS_MEDIA_DOWNLOADED, conversationIdType, messageIdType, str);
                                    } else {
                                        bzrdVar2.a(true, conversationIdType, messageIdType, str);
                                    }
                                    cqca.i("BugleCms", "Created telephony part: ".concat(uriB.toString()));
                                    bzrdVar2.h.d("CmsMediaPartToTelephonyPersister#updateBugleDbForMediaUri", new Runnable() { // from class: bzra
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            bzrd bzrdVar3 = bzrdVar2;
                                            bbae bbaeVar = (bbae) bzrdVar3.g.b();
                                            PartsTable.BindData bindData3 = bindData2;
                                            bbaeVar.i(bindData3.u(), messageIdType, str, uriB);
                                            if (bzrdVar3.k.a()) {
                                                bfrj bfrjVarB = ((baua) bzrdVar3.d.b()).b(bindData3.u());
                                                try {
                                                    if (bfrjVarB.moveToFirst()) {
                                                        List listAsList = Arrays.asList(bfrjVarB.o());
                                                        if (listAsList.isEmpty()) {
                                                            bfrjVarB.close();
                                                            return;
                                                        }
                                                        if (listAsList.contains(bindData3.K())) {
                                                            MessageCoreData messageCoreDataW = ((baxe) bzrdVar3.f.b()).w(bfrjVarB.g());
                                                            String[] strArr = botm.a;
                                                            bote boteVar = new bote();
                                                            boteVar.al();
                                                            boteVar.ap("updateConversationPreviewContentUri");
                                                            if (messageCoreDataW == null) {
                                                                bfrjVarB.close();
                                                                return;
                                                            } else {
                                                                baxe.W(messageCoreDataW, boteVar, null);
                                                                ((bakt) bzrdVar3.c.b()).W(bindData3.u(), boteVar);
                                                            }
                                                        }
                                                    }
                                                    bfrjVarB.close();
                                                    return;
                                                } catch (Throwable th) {
                                                    try {
                                                        bfrjVarB.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            }
                                            bgvb bgvbVarA = ((baua) bzrdVar3.d.b()).a(bindData3.u());
                                            try {
                                                if (bgvbVarA.moveToFirst()) {
                                                    List listAsList2 = Arrays.asList(bgvbVarA.t());
                                                    if (listAsList2.isEmpty()) {
                                                        bgvbVarA.close();
                                                        return;
                                                    }
                                                    if (listAsList2.contains(bindData3.K())) {
                                                        MessageCoreData messageCoreDataW2 = ((baxe) bzrdVar3.f.b()).w(bgvbVarA.j());
                                                        String[] strArr2 = botm.a;
                                                        bote boteVar2 = new bote();
                                                        boteVar2.al();
                                                        boteVar2.ap("updateConversationPreviewContentUri");
                                                        if (messageCoreDataW2 == null) {
                                                            bgvbVarA.close();
                                                            return;
                                                        } else {
                                                            baxe.W(messageCoreDataW2, boteVar2, null);
                                                            ((bakt) bzrdVar3.c.b()).W(bindData3.u(), boteVar2);
                                                        }
                                                    }
                                                }
                                                bgvbVarA.close();
                                            } catch (Throwable th3) {
                                                try {
                                                    bgvbVarA.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                                throw th3;
                                            }
                                        }
                                    });
                                    return eijx.e(true);
                                }
                            };
                            eosc eoscVar = bzrdVar.b;
                            return eijuVarG.i(eoozVar, eoscVar).f(Throwable.class, new eooz() { // from class: bzrc
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    boolean zBooleanValue = ((Boolean) ((cczi) cpxw.n.get()).e()).booleanValue();
                                    ConversationIdType conversationIdType = conversationIdTypeU;
                                    MessageIdType messageIdType = messageIdTypeV;
                                    bzrd bzrdVar2 = bzrdVar;
                                    String str = strK;
                                    if (zBooleanValue) {
                                        bzrdVar2.j.b(bvdl.CMS_MEDIA_DOWNLOAD_FAILED, conversationIdType, messageIdType, str);
                                    } else {
                                        bzrdVar2.a(false, conversationIdType, messageIdType, str);
                                    }
                                    return eijx.d(th);
                                }
                            }, eoscVar);
                        }
                    }, eoqg.a);
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(String.format("Invalid partId = %s", strD), e2);
                }
            }
        }, this.g);
        ejvr ejvrVar = new ejvr() { // from class: bztl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                return (bool == null || !bool.booleanValue()) ? new qam() : new qao();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarH.h(ejvrVar, eoqgVar).e(Exception.class, new ejvr() { // from class: bztm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (!(exc instanceof CronetException)) {
                    CmsTelephonyMediaRestoreWorker.e.s("Async exception; media restore failed internally!", exc);
                    return new qam();
                }
                int i = iA;
                CmsTelephonyMediaRestoreWorker cmsTelephonyMediaRestoreWorker = this.a;
                cqbd cqbdVarE = CmsTelephonyMediaRestoreWorker.e.e();
                cqbdVarE.y("Retry due to network failure. Remaining retry:", (i - cmsTelephonyMediaRestoreWorker.e()) + 1);
                cqbdVarE.s(exc);
                return new qan();
            }
        }, eoqgVar);
    }
}
