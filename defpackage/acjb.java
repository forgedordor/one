package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjb implements acin {
    public final bbdl a;
    private final eosc b;
    private final Context c;

    public acjb(Context context, bbdl bbdlVar, eosc eoscVar) {
        this.c = context;
        this.a = bbdlVar;
        this.b = eoscVar;
    }

    private final eiju k() {
        return eijx.g(new Callable() { // from class: aciz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List listH = this.a.a.h();
                StringBuilder sb = new StringBuilder();
                ekqh it = ((ekgb) listH).iterator();
                while (it.hasNext()) {
                    axcy axcyVar = (axcy) it.next();
                    Optional map = axcyVar.b().map(new Function() { // from class: acja
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((alqm) obj).p(((Boolean) alvx.d.e()).booleanValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    sb.append("SlotId: ");
                    sb.append(axcyVar.c());
                    sb.append("\tNormalizedNumber: ");
                    sb.append((String) map.orElse(null));
                    sb.append("\t\n");
                }
                ArrayList arrayList = new ArrayList();
                cdew cdewVar = new cdew();
                cdewVar.b("Self Number");
                cdewVar.c(sb.toString());
                arrayList.add(cdewVar.a());
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.acin
    public final eiju a() {
        return k().h(new ejvr() { // from class: aciy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                HashMap map = new HashMap();
                for (cdff cdffVar : (List) obj) {
                    map.put(cdffVar.a(), cdffVar.b());
                }
                return map;
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return k();
    }

    @Override // defpackage.acin
    public final elhx e() {
        return elhx.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_SELF_PHONE_NUMBER;
    }

    @Override // defpackage.acin
    public final String f() {
        return this.c.getString(R.string.self_phone_number_feedback_data_description);
    }

    @Override // defpackage.acin
    public final String g() {
        return this.c.getString(R.string.self_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.acin
    public final String h() {
        return this.c.getString(R.string.self_phone_number_feedback_data_name);
    }

    @Override // defpackage.acin
    public final String i() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.acin
    public final String j() {
        return this.c.getString(R.string.self_phone_number_feedback_data_rationale_title);
    }
}
