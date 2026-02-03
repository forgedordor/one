package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bafa {
    public static final /* synthetic */ int b = 0;
    private static final Comparator c = Comparator.EL.thenComparing(Comparator.CC.comparing(new Function() { // from class: baew
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            int i = bafa.b;
            return bafa.b(bindData.Q(), bindData.F());
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new Function() { // from class: baex
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ParticipantsTable.BindData) obj).V();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    public final cssf a;
    private final Context d;
    private final fcsu e;

    static {
        Comparator.EL.thenComparing(Comparator.CC.comparing(new Function() { // from class: baey
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Recipient recipient = (Recipient) obj;
                int i = bafa.b;
                return bafa.b(recipient.w(), recipient.q());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder())), new Function() { // from class: baez
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bafa.b;
                return ((Recipient) obj).g().j();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsLast(Comparator.CC.naturalOrder()));
    }

    public bafa(Context context, cssf cssfVar, fcsu fcsuVar) {
        this.d = context;
        this.a = cssfVar;
        this.e = fcsuVar;
    }

    public static String b(String str, chpq chpqVar) {
        if (chpqVar != chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
            return str;
        }
        return null;
    }

    public final String a(bbfo bbfoVar) {
        ekgb ekgbVar = bbfoVar.b;
        if (ekgbVar.isEmpty()) {
            ekgbVar = bbfoVar.a;
        }
        if (ekgbVar.isEmpty()) {
            return this.d.getString(R.string.group_conversation_title_everyone_else_left);
        }
        ekgbVar.size();
        return (String) Collection.EL.stream(ekgbVar).sorted(c).map(new Function() { // from class: baet
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bafa bafaVar = this.a;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                return aqbw.a() ? cssf.a(bafaVar.c(bindData)) : bafaVar.c(bindData);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: baeu
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
                return Objects.nonNull((String) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.joining(", "), new Function() { // from class: baev
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                return aqbw.a() ? str : this.a.a.d(str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public final String c(ParticipantsTable.BindData bindData) {
        String strA = ((bbcc) this.e.b()).a(bindData, true);
        String strO = bindData.O();
        return bindData.F() == chpq.PROFILE_PEOPLE_SHARING_SOURCE ? !TextUtils.isEmpty(strO) ? strO : this.d.getResources().getString(R.string.unknown_sender) : strA;
    }
}
