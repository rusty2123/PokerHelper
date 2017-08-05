import java.util.HashSet;
import java.util.Set;

/**
 * Created by Russell on 8/5/2017.
 */
public class TAGHandLibrary implements HandLibrary {

    private Set<String> epFourBet = new HashSet();
    private Set<String> epCallThreeBet = new HashSet();
    private Set<String> epThreeBet = new HashSet();
    private Set<String> epCall = new HashSet();
    private Set<String> epRaise = new HashSet();

    private Set<String> utgRaise = new HashSet();

    private Set<String> mpFourBet = new HashSet();
    private Set<String> mpCallThreeBet = new HashSet();
    private  Set<String> mpThreeBet = new HashSet();
    private Set<String> mpCall = new HashSet();
    private  Set<String> mpRaise = new HashSet();

    private Set<String> coFourBet = new HashSet();
    private  Set<String> coCallThreeBet = new HashSet();
    private Set<String> coThreeBet = new HashSet();
    private Set<String> coCall = new HashSet();
    private Set<String> coRaise = new HashSet();

    private Set<String> dFourBet = new HashSet();
    private Set<String> dCallThreeBet = new HashSet();
    private Set<String> dThreeBet = new HashSet();
    private Set<String> dCall = new HashSet();
    private Set<String> dRaise = new HashSet();

    TAGHandLibrary(){

    }

    public String getPlay() {
        return null;
    }

    public void populateSbContainers() {
        epFourBet.add("aa");
        epFourBet.add("kk");
        epFourBet.add("qq");
        epFourBet.add("jj");
        epFourBet.add("aks");
        epFourBet.add("ak");

        epCallThreeBet.add("tt");
        epCallThreeBet.add("99");
        epCallThreeBet.add("aqs");
        epCallThreeBet.add("aq");

        epThreeBet.add("aa");
        epThreeBet.add("kk");
        epThreeBet.add("qq");

        epCall.add("99");
        epCall.add("88");
        epCall.add("77");
        epCall.add("66");

        epRaise.add("aa");
        epRaise.add("kk");
        epRaise.add("qq");
        epRaise.add("jj");
        epRaise.add("tt");
        epRaise.add("99");
        epRaise.add("aks");
        epRaise.add("ak");
        epRaise.add("aqs");
        epRaise.add("aq");
        epRaise.add("ajs");
        epRaise.add("aj");
        epRaise.add("kqs");
    }

    public void populateBbContainers() {

    }


    public void populateUtgContainer() {

        utgRaise.addAll(epRaise);

        utgRaise.add("22");
        utgRaise.add("33");
        utgRaise.add("44");
        utgRaise.add("55");
        utgRaise.add("66");
        utgRaise.add("77");
        utgRaise.add("88");
    }

    public void populateMpContainers() {

        mpFourBet.addAll(epFourBet);
        mpFourBet.remove("jj");

        mpCallThreeBet.addAll(epCallThreeBet);
        mpFourBet.add("jj");

        mpThreeBet.addAll(epThreeBet);

        mpCall.addAll(epCall);
        mpCall.add("22");
        mpCall.add("33");
        mpCall.add("44");
        mpCall.add("55");
        mpCall.add("tt");
        mpCall.add("jj");
        mpCall.add("aqs");

        mpRaise.addAll(utgRaise);
        mpRaise.add("a9s");
        mpRaise.add("ats");
        mpRaise.add("qjs");
        mpRaise.add("kq");
    }

    public void populateCoContainers() {

        coFourBet.addAll(mpFourBet);
        coFourBet.add("jj");

        coCallThreeBet.addAll(epCallThreeBet);

        coThreeBet.addAll(mpThreeBet);
        coThreeBet.add("jj");

        coCall.addAll(mpCall);
        coCall.remove("aqs");

        coRaise.addAll(mpRaise);
        coRaise.add("at");
        coRaise.add("a6s");
        coRaise.add("a7s");
        coRaise.add("a8s");
        coRaise.add("a9s");
        coRaise.add("ats");
        coRaise.add("kqs");
        coRaise.add("kjs");
        coRaise.add("kts");
        coRaise.add("qts");
        coRaise.add("jts");
        coRaise.add("t9s");
        coRaise.add("98s");
        coRaise.add("87s");
        coRaise.add("j9s");
        coRaise.add("t8s");
        coRaise.add("97s");
        coRaise.add("kj");
        coRaise.add("qj");
        coRaise.add("qt");
        coRaise.add("jt");
    }

    public void populateDContainers() {

        dFourBet.addAll(coFourBet);

        dCallThreeBet.addAll(coThreeBet);

        dThreeBet.addAll(coThreeBet);

        dCall.addAll(coCall);

        dRaise.addAll(coRaise);
        dRaise.add("a9");
        dRaise.add("a2s");
        dRaise.add("a3s");
        dRaise.add("a4s");
        dRaise.add("k9s");
        dRaise.add("76s");

    }























}
