package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdu extends evsf implements evui {
    public ezdu() {
        super(ezdv.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ezdv ezdvVar = (ezdv) this.instance;
        ezdv ezdvVar2 = ezdv.a;
        evtg evtgVar = ezdvVar.f;
        if (!evtgVar.c()) {
            ezdvVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ezdvVar.f);
    }
}
