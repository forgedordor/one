package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhag {
    public static final fhaf a;

    static {
        fhaf fhafVar = new fhaf();
        a = fhafVar;
        fhafVar.g(1, "A", new fgwi());
        fhafVar.g(2, "NS", new fgyr());
        fhafVar.g(3, "MD", new fgyc());
        fhafVar.g(4, "MF", new fgyd());
        fhafVar.g(5, "CNAME", new fgwm());
        fhafVar.g(6, "SOA", new fgzo());
        fhafVar.g(7, "MB", new fgyb());
        fhafVar.g(8, "MG", new fgye());
        fhafVar.g(9, "MR", new fgyg());
        fhafVar.g(10, "NULL", new fgys());
        fhafVar.g(11, "WKS", new fhan());
        fhafVar.g(12, "PTR", new fgza());
        fhafVar.g(13, "HINFO", new fgxp());
        fhafVar.g(14, "MINFO", new fgyf());
        fhafVar.g(15, "MX", new fgyh());
        fhafVar.g(16, "TXT", new fhad());
        fhafVar.g(17, "RP", new fgzc());
        fhafVar.g(18, "AFSDB", new fgwf());
        fhafVar.g(19, "X25", new fhap());
        fhafVar.g(20, VCardConstants.PARAM_TYPE_ISDN, new fgxs());
        fhafVar.g(21, "RT", new fgzf());
        fhafVar.g(22, "NSAP", new fgyl());
        fhafVar.g(23, "NSAP-PTR", new fgym());
        fhafVar.g(24, "SIG", new fgzm());
        fhafVar.g(25, VCardConstants.PROPERTY_KEY, new fgxx());
        fhafVar.g(26, "PX", new fgzb());
        fhafVar.g(27, "GPOS", new fgxn());
        fhafVar.g(28, "AAAA", new fgwe());
        fhafVar.g(29, "LOC", new fgxz());
        fhafVar.g(30, "NXT", new fgyt());
        fhafVar.d(31, "EID");
        fhafVar.d(32, "NIMLOC");
        fhafVar.g(33, "SRV", new fgzq());
        fhafVar.d(34, "ATMA");
        fhafVar.g(35, "NAPTR", new fgyk());
        fhafVar.g(36, "KX", new fgxy());
        fhafVar.g(37, "CERT", new fgwl());
        fhafVar.g(38, "A6", new fgwd());
        fhafVar.g(39, "DNAME", new fgxb());
        fhafVar.g(41, "OPT", new fgyx());
        fhafVar.g(42, "APL", new fgwh());
        fhafVar.g(43, "DS", new fgxf());
        fhafVar.g(44, "SSHFP", new fgzr());
        fhafVar.g(45, "IPSECKEY", new fgxr());
        fhafVar.g(46, "RRSIG", new fgzd());
        fhafVar.g(47, "NSEC", new fgyp());
        fhafVar.g(48, "DNSKEY", new fgxd());
        fhafVar.g(49, "DHCID", new fgwz());
        fhafVar.g(50, "NSEC3", new fgyo());
        fhafVar.g(51, "NSEC3PARAM", new fgyn());
        fhafVar.g(52, "TLSA", new fgzz());
        fhafVar.g(53, "SMIMEA", new fgzn());
        fhafVar.g(61, "OPENPGPKEY", new fgyw());
        fhafVar.g(99, "SPF", new fgzp());
        fhafVar.g(249, "TKEY", new fgzy());
        fhafVar.g(250, "TSIG", new fhaa());
        fhafVar.d(251, "IXFR");
        fhafVar.d(252, "AXFR");
        fhafVar.d(253, "MAILB");
        fhafVar.d(254, "MAILA");
        fhafVar.d(255, "ANY");
        fhafVar.g(256, "URI", new fham());
        fhafVar.g(257, "CAA", new fgwk());
        fhafVar.g(32769, "DLV", new fgxa());
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i < 0 || i > 65535) {
            throw new fgxv(i);
        }
    }
}
