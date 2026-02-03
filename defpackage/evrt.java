package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evrt extends evrs {
    @Override // defpackage.evrs
    public final evry a(Object obj) {
        return ((evsi) obj).r;
    }

    @Override // defpackage.evrs
    public final evry b(Object obj) {
        return ((evsi) obj).a();
    }

    @Override // defpackage.evrs
    public final void c(Object obj) {
        a(obj).f();
    }

    @Override // defpackage.evrs
    public final void d(evut evutVar, Object obj, evrr evrrVar, evry evryVar) {
        evsl evslVar = (evsl) obj;
        evryVar.n(evslVar.d, evutVar.t(evslVar.c.getClass(), evrrVar));
    }

    @Override // defpackage.evrs
    public final void e(evrg evrgVar, Map.Entry entry) {
        evsk evskVar = (evsk) entry.getKey();
        if (!evskVar.d) {
            evwh evwhVar = evwh.DOUBLE;
            switch (evskVar.c) {
                case DOUBLE:
                    evrgVar.c(evskVar.b, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    evrgVar.g(evskVar.b, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    evrgVar.j(evskVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    evrgVar.s(evskVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    evrgVar.i(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    evrgVar.f(evskVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    evrgVar.e(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    evrgVar.a(evskVar.b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    evrgVar.q(evskVar.b, (String) entry.getValue());
                    break;
                case GROUP:
                    evrgVar.h(evskVar.b, entry.getValue(), evuq.a.a(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    evrgVar.k(evskVar.b, entry.getValue(), evuq.a.a(entry.getValue().getClass()));
                    break;
                case BYTES:
                    evrgVar.b(evskVar.b, (evqs) entry.getValue());
                    break;
                case UINT32:
                    evrgVar.r(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    evrgVar.i(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    evrgVar.m(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    evrgVar.n(evskVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    evrgVar.o(evskVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    evrgVar.p(evskVar.b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        evwh evwhVar2 = evwh.DOUBLE;
        switch (evskVar.c) {
            case DOUBLE:
                evva.t(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case FLOAT:
                evva.x(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case INT64:
                evva.A(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case UINT64:
                evva.I(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case INT32:
                evva.z(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case FIXED64:
                evva.w(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case FIXED32:
                evva.v(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case BOOL:
                evva.r(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case STRING:
                evva.G(evskVar.b, (List) entry.getValue(), evrgVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    evva.y(evskVar.b, (List) entry.getValue(), evrgVar, evuq.a.a(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    evva.B(evskVar.b, (List) entry.getValue(), evrgVar, evuq.a.a(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                evva.s(evskVar.b, (List) entry.getValue(), evrgVar);
                break;
            case UINT32:
                evva.H(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case ENUM:
                evva.z(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case SFIXED32:
                evva.C(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case SFIXED64:
                evva.D(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case SINT32:
                evva.E(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
            case SINT64:
                evva.F(evskVar.b, (List) entry.getValue(), evrgVar, evskVar.e);
                break;
        }
    }
}
