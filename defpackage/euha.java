package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euha extends euld {
    public boolean a;
    public euki b;
    public euja c;
    public ekgb d;
    public eule e;
    public byte f;
    public eujv g;
    public eujv h;
    public eujv i;
    public eujv j;
    public eujv k;
    public eujv l;
    public eujv m;
    public eujv n;

    @Override // defpackage.euld
    public final void a(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null actionsSuggestionsLocales");
        }
        this.d = ekgbVar;
    }

    @Override // defpackage.euld
    public final void b(eujv eujvVar) {
        if (eujvVar == null) {
            throw new NullPointerException("Null actionsSuggestionsModelProvider");
        }
        this.i = eujvVar;
    }

    @Override // defpackage.euld
    public final void c(eujv eujvVar) {
        if (eujvVar == null) {
            throw new NullPointerException("Null coreModelProvider");
        }
        this.g = eujvVar;
    }

    @Override // defpackage.euld
    public final void d(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.euld
    public final void e(eujv eujvVar) {
        if (eujvVar == null) {
            throw new NullPointerException("Null webrefModelProvider");
        }
        this.j = eujvVar;
    }
}
