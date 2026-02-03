package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxog {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final fcsu h;

    public bxog(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.h = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
    }

    public final void a(final MessagePartCoreData messagePartCoreData, final String str, final ContentType contentType, final bvdt bvdtVar, Action action) {
        boolean z = true;
        if (bvdtVar != bvdt.SUCCEEDED && bvdtVar != bvdt.FAILED && bvdtVar != bvdt.TOO_LARGE) {
            z = false;
        }
        ejwl.l(z);
        final Uri uriT = messagePartCoreData.t();
        uriT.getClass();
        if (auby.i("video/mpeg", contentType) || auby.i("video/mpeg4", contentType)) {
            a(messagePartCoreData, str, ContentType.e("video/mp4"), bvdtVar, action);
            return;
        }
        final long jA = ((cqmz) this.h.b()).a(uriT);
        if (((Integer) ((dqsn) this.e.b()).c("UpdateMessagePartAfterResizingHelper#executeInTransaction", new ejxr() { // from class: bxnz
            @Override // defpackage.ejxr
            public final Object get() {
                final Uri uri = Uri.parse(str);
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("UpdateMessagePartAfterResizingHelper#executeInTransaction");
                bvdt bvdtVar2 = bvdtVar;
                bsjhVar.w(bvdtVar2);
                bsjhVar.v();
                final bxog bxogVar = this.a;
                ContentType contentType2 = contentType;
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                final Uri uri2 = uriT;
                bvdt bvdtVar3 = bvdt.SUCCEEDED;
                if (bvdtVar2 == bvdtVar3) {
                    bsjhVar.z(uri);
                    bsjhVar.j(contentType2.toString());
                } else {
                    long j = jA;
                    if (j > 0 && j <= messagePartCoreData2.p()) {
                        if (((apwg) bxogVar.g.b()).a()) {
                            cqui cquiVar = (cqui) bxogVar.f.b();
                            final emke emkeVar = (emke) emki.a.createBuilder();
                            emkeVar.copyOnWrite();
                            emki emkiVar = (emki) emkeVar.instance;
                            emkiVar.b |= 32;
                            emkiVar.h = (int) j;
                            int i = le.z(contentType2.f()) ? 5 : le.j(contentType2.f()) ? 4 : le.n(contentType2.f(), false) ? 3 : 2;
                            emkeVar.copyOnWrite();
                            emki emkiVar2 = (emki) emkeVar.instance;
                            emkiVar2.t = emkg.a(i);
                            emkiVar2.b |= 131072;
                            emkeVar.copyOnWrite();
                            emki emkiVar3 = (emki) emkeVar.instance;
                            emkiVar3.c = emkf.a(5);
                            emkiVar3.b |= 1;
                            emkeVar.copyOnWrite();
                            emki emkiVar4 = (emki) emkeVar.instance;
                            emkiVar4.v = emkd.a(19);
                            emkiVar4.b |= 524288;
                            cquiVar.k(new Supplier() { // from class: bxoa
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return (emki) emkeVar.build();
                                }
                            });
                        }
                        bsjhVar.w(bvdtVar3);
                        bsjhVar.z(uri2);
                    }
                }
                final String strW = messagePartCoreData2.W();
                bsjhVar.D(new Function() { // from class: bxmr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        bsjlVar.j(strW);
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (bsjhVar.b().e() <= 0) {
                    ekrw ekrwVarH = bxog.a.h();
                    ekrwVarH.X(eksq.a, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper", "updateInScope", 165, "UpdateMessagePartAfterResizingHelper.java")).t("Attachment for %s gone. Deleting output.", uri2);
                    ((dqsn) bxogVar.e.b()).g(new dqsm() { // from class: bxob
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("UMPARH::deleteContent1::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: bxoc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bxlf.i(bxogVar.b, uri);
                        }
                    });
                } else if (bvdtVar2 == bvdtVar3) {
                    ((dqsn) bxogVar.e.b()).g(new dqsm() { // from class: bxod
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("UMPARH::deleteContent2::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: bxoe
                        @Override // java.lang.Runnable
                        public final void run() {
                            bxlf.i(bxogVar.b, uri2);
                        }
                    });
                }
                return Integer.valueOf(((bayy) bxogVar.d.b()).a());
            }
        })).intValue() > 0) {
            axtl.d(6, action);
        }
    }
}
