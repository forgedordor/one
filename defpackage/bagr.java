package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bagr extends babu implements amwi, bajl {
    public static final ekrg a;
    public static final cqce b;
    private final chwq A;
    private final cqpz B;
    private final cmvw C;
    private final lvy D;
    public final ConversationIdType c;
    final bagn d;
    public String f;
    public String h;
    public boolean i;
    public final List m;
    public final List n;
    public final List o;
    public final List p;

    @Deprecated
    public final cbpr q;
    public final fcsu r;
    public final cqmp s;
    public final baii t;
    public final bveg u;
    public final uhr v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    private final cogw z;
    public final AtomicReference e = new AtomicReference();
    public Optional g = Optional.empty();
    public int j = -2;
    public final AtomicReference k = new AtomicReference();
    public Optional l = Optional.empty();

    static {
        new ekrz("rcs_one_on_one_conditions", emfr.class, false, false);
        a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData");
        b = cqce.g("Bugle", "DraftMessageData");
        Pattern.compile("^[ -_\\x0A\\x0C\\x0D\\x61-\\x7E\\u0400-\\u1CC0\\u2C00-\\u2C5F\\u2D00-\\u2DFF\\u2E80-\\u3370\\u33E0-\\uD7FF\\uA000-\\uD7FF\\uD800-\\uDFFF]*$");
        cdag.h(cdag.b, "enable_warn_of_exceeding_sms_message_length_to_emergency_number_dialog", false);
    }

    public bagr(cogw cogwVar, cbpr cbprVar, chwq chwqVar, cqpz cqpzVar, cqmp cqmpVar, cmvw cmvwVar, baii baiiVar, bveg bvegVar, uhr uhrVar, fcsu fcsuVar, fcsu fcsuVar2, ConversationIdType conversationIdType, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.z = cogwVar;
        this.q = cbprVar;
        this.A = chwqVar;
        this.B = cqpzVar;
        this.s = cqmpVar;
        this.C = cmvwVar;
        this.t = baiiVar;
        this.u = bvegVar;
        this.v = uhrVar;
        this.w = fcsuVar;
        this.r = fcsuVar2;
        this.x = fcsuVar3;
        this.y = fcsuVar4;
        lvy lvyVar = new lvy();
        this.D = lvyVar;
        this.c = conversationIdType;
        lvyVar.j(false);
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        this.n = DesugarCollections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.o = arrayList2;
        DesugarCollections.unmodifiableList(arrayList2);
        this.p = new ArrayList();
        this.d = new bagn();
        this.i = false;
    }

    public static final boolean A(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.bj()) {
            return false;
        }
        messagePartCoreData.bx();
        return false;
    }

    private final boolean B(final MessagePartCoreData messagePartCoreData) {
        return Collection.EL.stream(this.p).anyMatch(new Predicate() { // from class: bagi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ekrg ekrgVar = bagr.a;
                return ((MessagePartCoreData) obj).bB(messagePartCoreData);
            }
        });
    }

    private final boolean C(MessagePartCoreData messagePartCoreData) {
        int iK = k();
        cczv cczvVar = cgwx.a;
        if (((Boolean) cczvVar.e()).booleanValue()) {
            Stream streamFilter = Collection.EL.stream(this.p).filter(new Predicate() { // from class: bagm
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((MessagePartCoreData) obj).bi();
                }
            });
            int i = ekgb.d;
            iK -= ((List) streamFilter.collect(ekcv.a)).size();
        }
        if (iK >= l()) {
            return (((Boolean) cczvVar.e()).booleanValue() && messagePartCoreData.bi()) ? false : true;
        }
        return false;
    }

    public static int n(int i) {
        return i != 20 ? 0 : 1;
    }

    @Override // defpackage.amwf
    public final /* synthetic */ ekgb a() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.amwf, defpackage.amvr
    public final /* synthetic */ String b() {
        return "text/plain";
    }

    @Override // defpackage.amwf
    public final String c() {
        return ejwk.b(this.f);
    }

    @Override // defpackage.amwi
    public final String d() {
        return ejwk.b(this.h);
    }

    @Override // defpackage.amwi
    public final boolean e() {
        return this.i;
    }

    @Override // defpackage.babu
    protected final void h() {
        this.d.clear();
    }

    public final int k() {
        return this.p.size();
    }

    public final int l() {
        return y() ? this.B.b("bugle_rcs_attachment_limit", 10) : this.B.b("bugle_mms_attachment_limit", 10);
    }

    public final int m() {
        eieu eieuVarK = eiiy.k("DraftMessageData::getDraftMessageType");
        try {
            boolean zX = x();
            eieuVarK.close();
            return true != zX ? 10 : 20;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int o() {
        this.j = -1;
        if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
            cqbd cqbdVarD = b.d();
            cqbdVarD.I("getSelfSubId");
            cqbdVarD.y("selfSubId", this.j);
            cqbdVarD.r();
        }
        return this.j;
    }

    public final String p(String str) {
        if (TextUtils.isEmpty(str) || !this.g.isPresent()) {
            return str;
        }
        return String.valueOf(str).concat((String) this.g.get());
    }

    public final void q() {
        this.d.d(this);
    }

    public final void r(int i) {
        eieu eieuVarK = eiiy.k("DraftMessageData::dispatchChanged");
        try {
            this.d.b(this, i);
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

    public final void s(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.h = str;
    }

    public final void t(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        if (dhim.a(this.f, str)) {
            return;
        }
        this.f = str;
        if (this.l.isEmpty()) {
            this.l = Optional.of(this.z.f());
        }
        cbpr cbprVar = this.q;
        cqdf.a(cbprVar.b, new cbpq(cbprVar, o(), ejwk.b(p(str)), eiid.k(new Runnable() { // from class: bagh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r(0);
            }
        })));
    }

    public final boolean u(MessagePartCoreData messagePartCoreData) {
        cqaz.k(messagePartCoreData.aX());
        boolean zC = C(messagePartCoreData);
        if (B(messagePartCoreData)) {
            return false;
        }
        if (zC) {
            messagePartCoreData.ah();
            return true;
        }
        this.m.add(messagePartCoreData);
        this.p.add(messagePartCoreData);
        return false;
    }

    public final boolean v(PendingAttachmentData pendingAttachmentData, String str) {
        boolean zC = C(pendingAttachmentData);
        if (zC || B(pendingAttachmentData)) {
            pendingAttachmentData.ah();
            return zC;
        }
        List list = this.o;
        cqaz.k(!list.contains(pendingAttachmentData));
        cqaz.a(0, pendingAttachmentData.k);
        list.add(pendingAttachmentData);
        this.p.add(pendingAttachmentData);
        pendingAttachmentData.bL();
        if (pendingAttachmentData.k == 0) {
            pendingAttachmentData.k = 1;
            baig baigVar = new baig(pendingAttachmentData, PendingAttachmentData.j, this, str);
            baigVar.e(new Void[0]);
            pendingAttachmentData.l = baigVar;
        }
        return false;
    }

    @Override // defpackage.bajl
    public final boolean w(boolean z) {
        return !z ? !this.m.isEmpty() : Collection.EL.stream(this.m).anyMatch(new Predicate() { // from class: bagk
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ekrg ekrgVar = bagr.a;
                return ((MessagePartCoreData) obj).G() != bvdr.GOOGLE_PHOTOS_LINK;
            }
        });
    }

    public final boolean x() {
        eieu eieuVarK = eiiy.k("DraftMessageData::requiresMmsForRecipients");
        try {
            boolean zA = this.C.a(false, o(), this.q.a());
            eieuVarK.close();
            if (!zA) {
                eieu eieuVarK2 = eiiy.k("DraftMessageData::requiresMmsForContent");
                try {
                    if (!this.i && TextUtils.isEmpty(this.h) && !this.q.c()) {
                        if (!w(true)) {
                            eieuVarK2.close();
                        } else if (((dggw) this.r.b()).w(o())) {
                            int iD = this.A.d();
                            eieuVarK2.close();
                            if (iD != 1) {
                            }
                        } else {
                            eieuVarK2.close();
                        }
                        return false;
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
            return true;
        } catch (Throwable th3) {
            try {
                eieuVarK.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final boolean y() {
        return !x();
    }

    public final void z(final MessagePartCoreData messagePartCoreData) {
        Predicate predicate = new Predicate() { // from class: bagj
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return messagePartCoreData.bB((MessagePartCoreData) obj);
            }
        };
        List list = this.o;
        Stream streamFilter = Collection.EL.stream(list).filter(predicate);
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            A((MessagePartCoreData) ekgbVar.get(i2));
        }
        if (!ekgbVar.isEmpty()) {
            list.removeAll(ekgbVar);
            this.p.removeAll(ekgbVar);
            Collection.EL.stream(ekgbVar).forEach(new Consumer() { // from class: bagl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((MessagePartCoreData) obj).ah();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            r(1);
        }
    }
}
