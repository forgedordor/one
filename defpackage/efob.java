package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efob implements efof {
    public static final /* synthetic */ int a = 0;
    private static final efoa b;
    private static final efoa c;
    private static final efoa d;
    private static final efoa e;
    private static final efoa f;
    private static final efoa g;
    private static final ekgb h;

    static {
        efoa efoaVarD = efoa.d(efnb.a, ChatMessage.class, new Supplier() { // from class: efns
            @Override // java.util.function.Supplier
            public final Object get() {
                return new efnb();
            }
        });
        b = efoaVarD;
        efoa efoaVarD2 = efoa.d(efni.a, IsComposingMessage.class, new Supplier() { // from class: efnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new efni();
            }
        });
        c = efoaVarD2;
        efoa efoaVarD3 = efoa.d(efnf.a, FileTransferInformation.class, new Supplier() { // from class: efnu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new efnf();
            }
        });
        d = efoaVarD3;
        efoa efoaVarD4 = efoa.d(efna.a, BasicTextMessage.class, new Supplier() { // from class: efnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new efna();
            }
        });
        e = efoaVarD4;
        efoa efoaVarD5 = efoa.d(efnk.a, MessageReceipt.class, new Supplier() { // from class: efnw
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = efob.a;
                return new efnk(new dflp() { // from class: efnz
                    @Override // defpackage.dflp
                    public final boolean a() {
                        return dflq.a();
                    }
                });
            }
        });
        f = efoaVarD5;
        efoa efoaVarD6 = efoa.d(efnj.a, LocationInformation.class, new Supplier() { // from class: efnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new efnj();
            }
        });
        g = efoaVarD6;
        h = ekgb.w(efoaVarD2, efoaVarD3, efoaVarD4, efoaVarD5, efoaVarD6, efoaVarD);
    }

    @Override // defpackage.efof
    public final efoe a(final ContentType contentType) {
        return ((efoa) Collection.EL.stream(h).filter(new Predicate() { // from class: efny
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
                int i = efob.a;
                return ((efoa) obj).a().g(contentType);
            }
        }).findAny().orElse(b)).e();
    }

    @Override // defpackage.efof
    public final efoe b(final Class cls) {
        return ((efoa) Collection.EL.stream(h).filter(new Predicate() { // from class: efnq
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
                int i = efob.a;
                return ((efoa) obj).b().getName().equals(cls.getName());
            }
        }).findAny().orElseThrow(new Supplier() { // from class: efnr
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = efob.a;
                return new efoh(cls);
            }
        })).e();
    }
}
