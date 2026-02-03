package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebpt extends ebpx {
    public ebpt() {
    }

    public ebob b() throws ebml {
        String strP = this.a.p(':');
        this.a.q(1);
        ebmi ebmiVar = this.a;
        StringBuilder sb = new StringBuilder();
        while (ebmiVar.g < ebmiVar.f.length() && ebmiVar.f.charAt(ebmiVar.g) != '\n') {
            sb.append(ebmiVar.f.charAt(ebmiVar.g));
            ebmiVar.g++;
        }
        if (ebmiVar.g < ebmiVar.f.length() && ebmiVar.f.charAt(ebmiVar.g) == '\n') {
            sb.append('\n');
            ebmiVar.g++;
        }
        return new ebnz(strP, sb.toString().trim());
    }

    protected final void d(int i) throws ebml {
        this.a.a(i);
        this.a.h();
        this.a.a(58);
        this.a.h();
    }

    public final void e(String str) throws ebml {
        if (this.a != null) {
            throw f("header already set");
        }
        this.a = new ebpu("command_keywordLexer", str);
    }

    protected ebpt(String str) {
        this.a = new ebpu("command_keywordLexer", str);
    }
}
