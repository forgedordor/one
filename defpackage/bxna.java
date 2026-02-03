package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxna implements bxmx {
    private static final cqce b = cqce.g("BugleResizing", "ResizingManager");
    public final Context a;
    private final bxmk c;
    private final bxne d;
    private final cgbn e;
    private final bxmv f;
    private final fcsu g;
    private volatile bxmy h = null;
    private int i = 0;
    private int j = 0;
    private final HashSet k = new HashSet();
    private ConversationId l = InvalidConversationId.a;

    public bxna(Context context, bxmk bxmkVar, bxne bxneVar, bxmv bxmvVar, cgbn cgbnVar, fcsu fcsuVar) {
        this.a = context;
        this.c = bxmkVar;
        this.d = bxneVar;
        this.e = cgbnVar;
        this.f = bxmvVar;
        this.g = fcsuVar;
    }

    @Override // defpackage.bxmx
    public final void a(Uri uri) {
        this.k.add(uri);
    }

    public final bxmy b() {
        bxna bxnaVar;
        bxmy bxndVar;
        cqbd cqbdVarA = b.a();
        cqbdVarA.A("finishedJobs", this.k);
        cqbdVarA.r();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("getAllPartsThatNeedProcessing");
        bsjeVarC.s();
        bsjeVarC.h(new Function() { // from class: bxms
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.s();
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = 0;
        bsjeVarC.d(new bsjb(PartsTable.d.k, false));
        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
        bxmv bxmvVar = this.f;
        try {
            ArrayList<MessagePartCoreData> arrayList = new ArrayList(bsgtVar.getCount());
            while (bsgtVar.moveToNext()) {
                arrayList.add(bxmvVar.b.f(bsgtVar));
            }
            bsgtVar.close();
            bxmy bxmyVar = null;
            MessagePartCoreData messagePartCoreData = null;
            int i2 = 0;
            for (MessagePartCoreData messagePartCoreData2 : arrayList) {
                if (!this.k.contains(messagePartCoreData2.w())) {
                    if (messagePartCoreData == null) {
                        messagePartCoreData = messagePartCoreData2;
                    }
                    if (messagePartCoreData2.bj()) {
                        i++;
                    } else if (messagePartCoreData2.bx()) {
                        i2++;
                    }
                }
            }
            this.i = i;
            this.j = i2;
            this.e.u(this.l, i, i2);
            if (messagePartCoreData == null) {
                return null;
            }
            if (messagePartCoreData.bj()) {
                bxmk bxmkVar = this.c;
                Context context = (Context) bxmkVar.a.b();
                context.getClass();
                ((bxmv) bxmkVar.c.b()).getClass();
                ayju ayjuVar = (ayju) bxmkVar.d.b();
                ayjuVar.getClass();
                bxnaVar = this;
                bxndVar = new bxmj(context, bxmkVar.b, ayjuVar, messagePartCoreData, bxnaVar);
            } else {
                bxnaVar = this;
                if (!messagePartCoreData.bx()) {
                    cqbd cqbdVarE = b.e();
                    cqbdVarE.I("Unsupported type.");
                    cqbdVarE.A("contentType", messagePartCoreData.R());
                    cqbdVarE.r();
                    ((ains) bxnaVar.g.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                    bxnaVar.h = bxmyVar;
                    return bxnaVar.h;
                }
                bxne bxneVar = bxnaVar.d;
                Context context2 = (Context) bxneVar.a.b();
                context2.getClass();
                aipo aipoVar = (aipo) bxneVar.b.b();
                aipoVar.getClass();
                cqxk cqxkVar = (cqxk) bxneVar.c.b();
                cqxkVar.getClass();
                ((bxmv) bxneVar.d.b()).getClass();
                ayju ayjuVar2 = (ayju) bxneVar.e.b();
                ayjuVar2.getClass();
                bxndVar = new bxnd(context2, aipoVar, cqxkVar, ayjuVar2, messagePartCoreData, bxnaVar);
                bxnaVar = bxnaVar;
            }
            bxmyVar = bxndVar;
            bxnaVar.h = bxmyVar;
            return bxnaVar.h;
        } finally {
        }
    }

    public final void c(Iterable iterable, ConversationId conversationId) {
        eieu eieuVarK;
        eieu eieuVarK2 = eiiy.k("ResizingManager#attachmentsChanged");
        try {
            cqaz.h();
            if (iterable != null && iterable.iterator().hasNext() && !(conversationId instanceof InvalidConversationId)) {
                this.l = conversationId;
            }
            bxmy bxmyVar = this.h;
            int i = 0;
            if (bxmyVar != null) {
                eieuVarK = eiiy.k("ResizingManager::maybeCancel");
                try {
                    cqaz.h();
                    if (!bxmyVar.f) {
                        final Uri uri = bxmyVar.b;
                        final Uri uri2 = bxmyVar.c;
                        bsje bsjeVarC = PartsTable.c();
                        bsjeVarC.A("isAttachmentNeedsProcessing");
                        bsjeVarC.h(new Function() { // from class: bxmt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsjl bsjlVar = (bsjl) obj;
                                bsjlVar.r(uri);
                                bsjlVar.v(uri2);
                                return bsjlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsjeVarC.d(new bsjb(PartsTable.d.k, false));
                        bsjeVarC.y(1);
                        bsjeVarC.f(new Function() { // from class: bxmu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((bsgr) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                        try {
                            boolean zMoveToNext = bsgtVar.moveToNext();
                            bsgtVar.close();
                            if (!zMoveToNext) {
                                cqbd cqbdVarA = bxmy.a.a();
                                cqbdVarA.I("Aborting");
                                cqbdVarA.I(bxmyVar.getClass().getName());
                                cqbdVarA.A("contentUri", bxmyVar.c);
                                cqbdVarA.A("outputUri", bxmyVar.b);
                                cqbdVarA.z("maxFileSize", bxmyVar.d);
                                cqbdVarA.r();
                                bxmyVar.a();
                            }
                        } finally {
                        }
                    }
                    eieuVarK.close();
                } finally {
                }
            }
            if (iterable != null) {
                final Intent intentPutExtra = Build.VERSION.SDK_INT >= 35 ? new Intent(this.a, (Class<?>) ResizingServiceAndroidV.class).setFlags(1).putExtra("op", 0) : new Intent(this.a, (Class<?>) ResizingService.class).setFlags(1).putExtra("op", 0);
                Iterator it = iterable.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    if (messagePartCoreData.bp() && messagePartCoreData.w() != null) {
                        intentPutExtra.setData(messagePartCoreData.t());
                        eieuVarK = eiiy.k("ResizingManager::startForegroundService");
                        try {
                            cdim.a(new cdil() { // from class: bxmz
                                @Override // defpackage.cdil
                                public final void a() {
                                    this.a.a.startForegroundService(intentPutExtra);
                                }
                            });
                            eieuVarK.close();
                            if (messagePartCoreData.bj()) {
                                i++;
                            } else if (messagePartCoreData.bx()) {
                                i2++;
                            }
                            cqbd cqbdVarA2 = b.a();
                            cqbdVarA2.I("start resizing.");
                            cqbdVarA2.A("contentUri", messagePartCoreData.t());
                            cqbdVarA2.r();
                        } finally {
                        }
                    }
                }
                if (i > 0 || i2 > 0) {
                    int i3 = this.i + i;
                    this.i = i3;
                    int i4 = this.j + i2;
                    this.j = i4;
                    this.e.u(this.l, i3, i4);
                }
            }
            eieuVarK2.close();
        } catch (Throwable th) {
            try {
                eieuVarK2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
