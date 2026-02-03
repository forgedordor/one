package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqb extends efov {
    static final ejvj a = new efqw();
    static final ejvj b = new efqd();

    @Override // defpackage.efov
    public final void b(GroupInformation groupInformation, cjht cjhtVar) {
        cjmd cjmdVar = (cjmd) cjme.a.createBuilder();
        String strD = groupInformation.d();
        cjmdVar.copyOnWrite();
        cjme cjmeVar = (cjme) cjmdVar.instance;
        cjmeVar.b |= 1;
        cjmeVar.c = strD;
        cjhtVar.copyOnWrite();
        cjhu cjhuVar = (cjhu) cjhtVar.instance;
        cjme cjmeVar2 = (cjme) cjmdVar.build();
        cjhu cjhuVar2 = cjhu.a;
        cjmeVar2.getClass();
        cjhuVar.e = cjmeVar2;
        cjhuVar.b |= 4;
    }

    @Override // defpackage.efov
    public final void c(GroupInformation groupInformation, cjht cjhtVar) {
        Iterable iterable = (Iterable) Collection.EL.stream(groupInformation.a()).map(new Function() { // from class: efpz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cjhy) efqb.b.fH().fM((GroupMember) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        cjhtVar.copyOnWrite();
        cjhu cjhuVar = (cjhu) cjhtVar.instance;
        cjhu cjhuVar2 = cjhu.a;
        evtg evtgVar = cjhuVar.f;
        if (!evtgVar.c()) {
            cjhuVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjhuVar.f);
    }

    @Override // defpackage.efov
    public final void d(GroupInformation groupInformation, final cjht cjhtVar) {
        groupInformation.b().ifPresent(new Consumer() { // from class: efqa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                GroupRemoteCapabilities groupRemoteCapabilities = (GroupRemoteCapabilities) obj;
                cjhn cjhnVar = (cjhn) cjhq.a.createBuilder();
                boolean zC = groupRemoteCapabilities.c();
                cjhnVar.copyOnWrite();
                cjhq cjhqVar = (cjhq) cjhnVar.instance;
                cjhqVar.b |= 1;
                cjhqVar.c = zC;
                if (groupRemoteCapabilities.a().isPresent() && ((Boolean) groupRemoteCapabilities.a().get()).booleanValue()) {
                    cjhnVar.copyOnWrite();
                    cjhq cjhqVar2 = (cjhq) cjhnVar.instance;
                    cjhqVar2.d = 1;
                    cjhqVar2.b |= 2;
                } else if (groupRemoteCapabilities.b().isPresent() && ((Boolean) groupRemoteCapabilities.b().get()).booleanValue()) {
                    cjhnVar.copyOnWrite();
                    cjhq cjhqVar3 = (cjhq) cjhnVar.instance;
                    cjhqVar3.d = 2;
                    cjhqVar3.b |= 2;
                } else {
                    cjhnVar.copyOnWrite();
                    cjhq cjhqVar4 = (cjhq) cjhnVar.instance;
                    cjhqVar4.d = 0;
                    cjhqVar4.b |= 2;
                }
                cjht cjhtVar2 = cjhtVar;
                cjhtVar2.copyOnWrite();
                cjhu cjhuVar = (cjhu) cjhtVar2.instance;
                cjhq cjhqVar5 = (cjhq) cjhnVar.build();
                cjhu cjhuVar2 = cjhu.a;
                cjhqVar5.getClass();
                cjhuVar.g = cjhqVar5;
                cjhuVar.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.efov
    public final void e(GroupInformation groupInformation, cjht cjhtVar) {
        if (groupInformation.c().isPresent()) {
            String strF = groupInformation.f();
            cjhtVar.copyOnWrite();
            cjhu cjhuVar = (cjhu) cjhtVar.instance;
            cjhu cjhuVar2 = cjhu.a;
            cjhuVar.b |= 2;
            cjhuVar.d = strF;
            return;
        }
        if (groupInformation.f().isEmpty()) {
            return;
        }
        String strF2 = groupInformation.f();
        cjhtVar.copyOnWrite();
        cjhu cjhuVar3 = (cjhu) cjhtVar.instance;
        cjhu cjhuVar4 = cjhu.a;
        cjhuVar3.b |= 2;
        cjhuVar3.d = strF2;
    }

    @Override // defpackage.efov
    public final void f(GroupInformation groupInformation, final cjht cjhtVar) {
        groupInformation.c().ifPresent(new Consumer() { // from class: efpy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                SubjectExtension subjectExtension = (SubjectExtension) obj;
                cjlj cjljVar = (cjlj) cjlk.a.createBuilder();
                cjju cjjuVar = (cjju) efqb.a.fH().fM(subjectExtension.a().get());
                cjljVar.copyOnWrite();
                cjlk cjlkVar = (cjlk) cjljVar.instance;
                cjjuVar.getClass();
                cjlkVar.c = cjjuVar;
                cjlkVar.b |= 1;
                evvp evvpVarC = evxc.c(((Instant) subjectExtension.b().get()).toEpochMilli());
                cjljVar.copyOnWrite();
                cjlk cjlkVar2 = (cjlk) cjljVar.instance;
                evvpVarC.getClass();
                cjlkVar2.d = evvpVarC;
                cjlkVar2.b |= 2;
                cjlk cjlkVar3 = (cjlk) cjljVar.build();
                cjht cjhtVar2 = cjhtVar;
                cjhtVar2.copyOnWrite();
                cjhu cjhuVar = (cjhu) cjhtVar2.instance;
                cjhu cjhuVar2 = cjhu.a;
                cjlkVar3.getClass();
                cjhuVar.h = cjlkVar3;
                cjhuVar.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
